/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import database.JDBCUntil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Detail;

/**
 *
 * @author PC
 */
public class DAODetail implements DAOInterface<Detail> {

    public static DAODetail getInstand() {
        return new DAODetail();
    }

    @Override
    public boolean insert(Detail t) {
        int result = 0;
        try {
            Connection con = JDBCUntil.getConnection();

            String sql = "insert into detailSaff values (?, ?, ?, ?, ?, ?)";

            PreparedStatement pa = con.prepareStatement(sql);

            pa.setString(1, t.getIdSaff());
            pa.setTime(2, t.getBeginTime());
            pa.setTime(3, t.getFinishTime());
            pa.setInt(4, t.getDayOfWeef());
            pa.setFloat(5, t.getSalaryOfHour());
            pa.setFloat(6, t.getBonus());

            result = pa.executeUpdate();

            JDBCUntil.closeConnection(con);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result > 0;
    }

    @Override
    public boolean update(Detail t) {
        int result = 0;
        try {
            Connection con = JDBCUntil.getConnection();

            String sql = "update detailSaff\n"
                    + "set \n"
                    + "	beginTime = ?,\n"
                    + "	finishTime = ?,\n"
                    + "	dayOfWeef = ?,\n"
                    + "	salaryOfHour = ?,\n"
                    + "	bonus = ?\n"
                    + "where idSaff = ?";

            PreparedStatement pa = con.prepareStatement(sql);

            pa.setString(6, t.getIdSaff());
            pa.setTime(1, t.getBeginTime());
            pa.setTime(2, t.getFinishTime());
            pa.setInt(3, t.getDayOfWeef());
            pa.setFloat(4, t.getSalaryOfHour());
            pa.setFloat(5, t.getBonus());

            result = pa.executeUpdate();

            JDBCUntil.closeConnection(con);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return result > 0;
    }

    @Override
    public boolean delete(Detail t) {
        int result = 0;
        try {
            Connection con = JDBCUntil.getConnection();

            String sql = "delete from detailSaff\n"
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
    public ArrayList<Detail> selectAll() {
        ArrayList<Detail> list = new ArrayList<>();

        try {
            Connection con = JDBCUntil.getConnection();

            String sql = "select * from detailSaff";

            PreparedStatement pa = con.prepareStatement(sql);

            ResultSet rs = pa.executeQuery();

            while (rs.next()) {

                list.add(new Detail(
                        rs.getString("idSaff"),
                        rs.getTime("beginTime"),
                        rs.getTime("finishTime"),
                        rs.getInt("dayOfWeef"),
                        rs.getFloat("salaryOfHour"),
                        rs.getFloat("bonus")));
            }

            JDBCUntil.closeConnection(con);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    @Override
    public Detail selectById(String t) {
        Detail us = new Detail();
        try {
            Connection con = JDBCUntil.getConnection();

            String sql = "select * from detailSaff  where idSaff = ?";

            PreparedStatement pa = con.prepareStatement(sql);

            pa.setString(1, t);

            ResultSet rs = pa.executeQuery();

            if (rs.next()) {

                us.setIdSaff(rs.getString("idSaff"));
                us.setBeginTime(rs.getTime("beginTime"));
                us.setFinishTime(rs.getTime("finishTime"));
                us.setDayOfWeef(rs.getInt("dayOfWeef"));
                us.setSalaryOfHour(rs.getFloat("salaryOfHour"));
                us.setBonus(rs.getFloat("bonus"));

            }

            JDBCUntil.closeConnection(con);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return us;
    }

    @Override
    public ArrayList<Detail> selectByConditon(String condition) {
        ArrayList<Detail> list = new ArrayList<>();

        try {
            Connection con = JDBCUntil.getConnection();

            String sql = "select * from detailSaff where idSaff like ? ";

            PreparedStatement pa = con.prepareStatement(sql);

            pa.setString(1, "%" + condition + "%");

            ResultSet rs = pa.executeQuery();

            while (rs.next()) {

                list.add(new Detail(
                        rs.getString("idSaff"),
                        rs.getTime("beginTime"),
                        rs.getTime("finishTime"),
                        rs.getInt("dayOfWeef"),
                        rs.getFloat("salaryOfHour"),
                        rs.getFloat("bonus")));
            }

            JDBCUntil.closeConnection(con);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return !list.isEmpty() ? list : null;
    }


}
