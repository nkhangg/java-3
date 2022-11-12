/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import database.JDBCUntil;
import java.io.Serializable;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.sql.rowset.serial.SerialBlob;
import model.Pet;
import model.Saff;

/**
 *
 * @author PC
 */
public class DAOPet implements DAOInterface<Pet> {

    public static DAOPet getInstand() {
        return new DAOPet();
    }

    @Override
    public boolean insert(Pet t) {
        int result = 0;
        try {
            Connection con = JDBCUntil.getConnection();

            String sql = "insert into pet values (?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement pa = con.prepareStatement(sql);

            pa.setString(1, t.getNamePet());
            pa.setInt(2, t.getAge());
            pa.setFloat(3, t.getWeight());
            pa.setString(4, t.getType());
            pa.setString(5, t.getGenther());
            pa.setString(6, t.getColor());
            pa.setFloat(7, t.getPrice());
            if (t.getImage() != null) {
                Blob image = new SerialBlob(t.getImage());
                pa.setBlob(8, image);
            } else {
                Blob image = null;
                pa.setBlob(8, image);
            }

            result = pa.executeUpdate();

            JDBCUntil.closeConnection(con);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result > 0;
    }

    @Override
    public boolean update(Pet t) {
        int result = 0;
        try {
            Connection con = JDBCUntil.getConnection();

            String sql = "update pet\n"
                    + "set \n"
                    + "	namePet = ?,\n"
                    + "	age = ?,\n"
                    + "	weight = ?,\n"
                    + "	type = ?,\n"
                    + "	genther = ?,\n"
                    + "	color = ?,\n"
                    + "	price = ?,\n"
                    + "	image = ?\n"
                    + "where idPet = ?";

            PreparedStatement pa = con.prepareStatement(sql);

            pa.setInt(9, t.getIdPet());
            pa.setString(1, t.getNamePet());
            pa.setInt(2, t.getAge());
            pa.setFloat(3, t.getWeight());
            pa.setString(4, t.getType());
            pa.setString(5, t.getGenther());
            pa.setString(6, t.getColor());
            pa.setFloat(7, t.getPrice());

            if (t.getImage() != null) {
                Blob image = new SerialBlob(t.getImage());
                pa.setBlob(8, image);
            } else {
                Blob image = null;
                pa.setBlob(8, image);
            }

            result = pa.executeUpdate();

            JDBCUntil.closeConnection(con);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return result > 0;
    }

    @Override
    public boolean delete(Pet t) {
        int result = 0;
        try {
            Connection con = JDBCUntil.getConnection();

            String sql = "delete from pet\n"
                    + "where idPet = ?";

            PreparedStatement pa = con.prepareStatement(sql);

            pa.setInt(1, t.getIdPet());

            result = pa.executeUpdate();

            JDBCUntil.closeConnection(con);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result > 0;
    }

    @Override
    public ArrayList<Pet> selectAll() {
        ArrayList<Pet> list = new ArrayList<>();

        try {
            Connection con = JDBCUntil.getConnection();

            String sql = "select * from pet";

            PreparedStatement pa = con.prepareStatement(sql);

            ResultSet rs = pa.executeQuery();

            while (rs.next()) {
                Blob blod = rs.getBlob("image");
                byte[] b = null;
                if (blod != null) {
                    b = blod.getBytes(1, (int) blod.length());
                }

                list.add(new Pet(
                        rs.getInt("idPet"),
                        rs.getString("namePet"),
                        rs.getInt("age"),
                        rs.getFloat("weight"),
                        rs.getString("type"),
                        rs.getString("genther"),
                        rs.getString("color"),
                        rs.getFloat("price"),
                        b));
            }

            JDBCUntil.closeConnection(con);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    public Pet selectById(String t) {
        Pet us = new Pet();
        try {
            Connection con = JDBCUntil.getConnection();

            String sql = "select * from pet  where idPet = ?";

            PreparedStatement pa = con.prepareStatement(sql);

            pa.setInt(1, Integer.parseInt(t));

            ResultSet rs = pa.executeQuery();

            if (rs.next()) {

                us.setIdPet(rs.getInt("idPet"));
                us.setNamePet(rs.getString("namePet"));
                us.setAge(rs.getInt("age"));
                us.setWeight(rs.getFloat("weight"));
                us.setGenther(rs.getString("type"));
                us.setGenther(rs.getString("genther"));
                us.setColor(rs.getString("color"));
                us.setPrice(rs.getFloat("price"));

                Blob blod = rs.getBlob("image");
                if (blod != null) {
                    us.setImage(blod.getBytes(1, (int) rs.getBlob("image").length()));
                }
            }

            JDBCUntil.closeConnection(con);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return us;
    }

    @Override
    public ArrayList<Pet> selectByConditon(String condition) {
        ArrayList<Pet> list = new ArrayList<>();

        try {
            Connection con = JDBCUntil.getConnection();

            String sql = "select * from pet where namePet like ? ";

            PreparedStatement pa = con.prepareStatement(sql);

            pa.setString(1, "%" + condition + "%");

            ResultSet rs = pa.executeQuery();

            while (rs.next()) {
                Blob blod = rs.getBlob("image");
                byte[] b = null;
                if (blod != null) {
                    b = blod.getBytes(1, (int) blod.length());
                }

                list.add(new Pet(
                        rs.getInt("idPet"),
                        rs.getString("namePet"),
                        rs.getInt("age"),
                        rs.getFloat("weight"),
                        rs.getString("type"),
                        rs.getString("genther"),
                        rs.getString("color"),
                        rs.getFloat("price"),
                        b));
            }

            JDBCUntil.closeConnection(con);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return !list.isEmpty() ? list : null;
    }

//    public static void main(String[] args) {
//
//        for (int i = 0; i < 10; i++) {
//            boolean p = DAOPet.getInstand().insert(new Pet("Dog " + i, i, i, "Cho " + i, "Male", "white", i * 10000, null));
//            System.out.println(p);
//        }
//    }
}
