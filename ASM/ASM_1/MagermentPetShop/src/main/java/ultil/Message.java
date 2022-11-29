/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ultil;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class Message {

    public static void showWarning(String mess, Component input) {
        JOptionPane.showMessageDialog(input, mess, "Warning", JOptionPane.WARNING_MESSAGE);
    }

    // thông báo thành công
    public static void showSuccess(String mess, Component input) {
        JOptionPane.showMessageDialog(input, mess, "Success", JOptionPane.INFORMATION_MESSAGE);
    }

    // thống lựa chọn
    public static boolean showSelected(String mess, Component input) {
        int chose = JOptionPane.showConfirmDialog(input, mess, "Notification", JOptionPane.YES_NO_OPTION);
        if (chose == JOptionPane.YES_OPTION) {
            return true;

        }

        return false;
    }

    // bật cửa sổ input
    public static String showInput(String mess, Component input) {
        return JOptionPane.showInputDialog(input, mess);
    }
}
