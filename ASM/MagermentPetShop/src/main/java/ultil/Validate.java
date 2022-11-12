/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ultil;

import java.awt.Component;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import model.MUser;
import model.User;

/**
 *
 * @author PC
 */
public class Validate {

    public static boolean isEmpty(JTextField input) {
        if (input.getText().equals("")) {
            return true;
        }
        return false;
    }

    public static boolean isDouble(JTextField input) {
        try {
            double number = Double.parseDouble(input.getText());
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean isInt(JTextField input) {
        try {
            int number = Integer.parseInt(input.getText());
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean isFloat(JTextField input) {
        try {
            float number = Float.parseFloat(input.getText());
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean validateLogin(JTextField username, JPasswordField password, Component input) {
        StringBuffer str = new StringBuffer();
        User user = MUser.selectByUsername(username.getText());

        if (isEmpty(username) || isEmpty(password)) {
            str.append("Username or Password cannot be empty !");
            Message.showWarning(str.toString(), input);
            return false;
        }

        if (user == null) {
            str.append("Your username or password is incorrect !");
            Message.showWarning(str.toString(), input);
            return false;
        }

        return true;
    }
    
    public static boolean  validatePetId(JTextField input, Component cpn){
        if(Validate.isEmpty(input)){
            Message.showWarning("You must not leave the ID blank !", cpn);
            return false;
        }else{
            if(!Validate.isInt(input)){
                Message.showWarning("ID must be numeric !", cpn);
                return false;
            }
        }
        return true;
    }

}
