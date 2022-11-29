/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import dao.DAOUser;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class MUser {

    public static User selectByUsername(String username) {
        return DAOUser.getInstand().selectById(username).getUsername() != null ? DAOUser.getInstand().selectById(username) : null;
    }

}
