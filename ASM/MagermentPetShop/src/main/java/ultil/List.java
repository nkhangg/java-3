/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ultil;

import java.sql.Time;
import java.util.ArrayList;
import model.MyTime;

/**
 *
 * @author PC
 */
public class List {
    
    public static ArrayList<MyTime> getListTime() {
        ArrayList<MyTime> list = new ArrayList<>();
        for (int i = 7; i <= 22; i++) {
            list.add(new MyTime(i, new Time(i, 00, 00)));
        }
        return list;
    }
}
