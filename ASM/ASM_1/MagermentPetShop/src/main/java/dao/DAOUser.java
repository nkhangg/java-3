/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import database.JDBCUntil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.User;

/**
 *
 * @author PC
 */
public class DAOUser {

    public static DAOUser getInstand() {
        return new DAOUser();
    }

    public User selectById(String t) {
        User us = new User();
        try {
            Connection con = JDBCUntil.getConnection();

            String sql = "select * from users where username = ?";

            PreparedStatement pa = con.prepareStatement(sql);

            pa.setString(1, t);

            ResultSet rs = pa.executeQuery();

            if (rs.next()) {
                us.setUsername(rs.getString("username"));
                us.setPassword(rs.getString("password"));
                us.setRole(rs.getString("role"));

            }

            JDBCUntil.closeConnection(con);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return us;
    }

}
