/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import database.JDBCUntil;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.sql.rowset.serial.SerialBlob;
import model.Saff;

/**
 *
 * @author PC
 */
public class DAOSaff implements DAOInterface<Saff> {

    public static DAOSaff getInstand() {
        return new DAOSaff();
    }

    @Override
    public boolean insert(Saff t) {
        int result = 0;
        try {
            Connection con = JDBCUntil.getConnection();

            String sql = "insert into saff values (?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement pa = con.prepareStatement(sql);

            pa.setString(1, t.getIdSaff());
            pa.setString(2, t.getNameSaff());
            pa.setDate(3, t.getDateOfBirth());
            pa.setString(4, t.getGenther());
            pa.setString(5, t.getAddress());
            pa.setString(6, t.getEmail());
            pa.setString(7, t.getRole());

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
    public boolean update(Saff t) {
        int result = 0;
        try {
            Connection con = JDBCUntil.getConnection();

            String sql = "update saff\n"
                    + "set \n"
                    + "	nameSaff = ?,\n"
                    + "	dateOfBirth = ?,\n"
                    + "	genther = ?,\n"
                    + "	address = ?,\n"
                    + "	email = ?,\n"
                    + "	role = ?,\n"
                    + "	image = ?\n"
                    + "where idSaff = ?";

            PreparedStatement pa = con.prepareStatement(sql);

            pa.setString(8, t.getIdSaff());
            pa.setString(1, t.getNameSaff());
            pa.setDate(2, t.getDateOfBirth());
            pa.setString(3, t.getGenther());
            pa.setString(4, t.getAddress());
            pa.setString(5, t.getEmail());
            pa.setString(6, t.getRole());

            if (t.getImage() != null) {
                Blob image = new SerialBlob(t.getImage());
                pa.setBlob(7, image);
            } else {
                Blob image = null;
                pa.setBlob(7, image);
            }

            result = pa.executeUpdate();

            JDBCUntil.closeConnection(con);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return result > 0;
    }

    @Override
    public boolean delete(Saff t) {
        int result = 0;
        try {
            Connection con = JDBCUntil.getConnection();

            String sql = "delete from saff\n"
                    + "where idSaff = ?";

            PreparedStatement pa = con.prepareStatement(sql);

            pa.setString(1, t.getIdSaff());

            result = pa.executeUpdate();

            JDBCUntil.closeConnection(con);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result > 0;
    }

    @Override
    public ArrayList<Saff> selectAll() {
        ArrayList<Saff> list = new ArrayList<>();

        try {
            Connection con = JDBCUntil.getConnection();

            String sql = "select * from saff";

            PreparedStatement pa = con.prepareStatement(sql);

            ResultSet rs = pa.executeQuery();

            while (rs.next()) {
                Blob blod = rs.getBlob("image");
                byte[] b = null;
                if (blod != null) {
                    b = blod.getBytes(1, (int) blod.length());
                }

                list.add(new Saff(rs.getString("idSaff"),
                        rs.getString("nameSaff"),
                        rs.getDate("dateOfBirth"),
                        rs.getString("genther"),
                        rs.getString("address"),
                        rs.getString("email"),
                        rs.getString("role"),
                        b)
                );
            }

            JDBCUntil.closeConnection(con);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    @Override
    public Saff selectById(String t) {
        Saff us = new Saff();
        try {
            Connection con = JDBCUntil.getConnection();

            String sql = "select * from saff  where idSaff = ?";

            PreparedStatement pa = con.prepareStatement(sql);

            pa.setString(1, t);

            ResultSet rs = pa.executeQuery();

            if (rs.next()) {

                us.setIdSaff(rs.getString("idSaff"));
                us.setNameSaff(rs.getString("nameSaff"));
                us.setDateOfBirth(rs.getDate("dateOfBirth"));
                us.setEmail(rs.getString("email"));
                us.setGenther(rs.getString("genther"));
                us.setAddress(rs.getString("address"));
                us.setRole(rs.getString("role"));

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
    public ArrayList<Saff> selectByConditon(String condition) {
        ArrayList<Saff> list = new ArrayList<>();

        try {
            Connection con = JDBCUntil.getConnection();

            String sql = "select * from saff where nameSaff like ? ";

            PreparedStatement pa = con.prepareStatement(sql);

            pa.setString(1, "%" + condition + "%");

            ResultSet rs = pa.executeQuery();

            while (rs.next()) {

                Blob blod = rs.getBlob("image");
                byte[] b = null;
                if (blod != null) {
                    b = blod.getBytes(1, (int) blod.length());
                }

                list.add(new Saff(rs.getString("idSaff"),
                        rs.getString("nameSaff"),
                        rs.getDate("dateOfBirth"),
                        rs.getString("genther"),
                        rs.getString("address"),
                        rs.getString("email"),
                        rs.getString("role"),
                        b)
                );
            }

            JDBCUntil.closeConnection(con);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return !list.isEmpty() ? list : null;
    }

}
