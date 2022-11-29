/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ultil;

import javax.swing.JLabel;

/**
 *
 * @author PC
 */
public class ContantString {

    public static String contantStingNotify() {
        return "You are viewing the entire list (by price with pets by date of birth with people)";
    }

    public static String contantStingNotifyHighest() {
        return "You are watching the top 3 highest (by price with pets by date of birth with people)";
    }

    public static String contantStingNotifyLowest() {
        return "You are watching the lowest top 3 (by price with pets by date of birth with people)";
    }

    public static void notifyListPet(JLabel notify) {
        notify.setText(ContantString.contantStingNotify());
    }

    public static void notifyListPetLowest(JLabel notify) {
        notify.setText(ContantString.contantStingNotifyLowest());
    }
    
    public static void notifyListPetHighest(JLabel notify) {
        notify.setText(ContantString.contantStingNotifyHighest());
    }
}
