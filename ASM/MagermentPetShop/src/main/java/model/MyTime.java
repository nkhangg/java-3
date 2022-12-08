/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Time;

/**
 *
 * @author PC
 */
public class MyTime {

    private int timeNumber;
    private Time time;

    public MyTime(int timeNumber, Time time) {
        this.timeNumber = timeNumber;
        this.time = time;
    }

    public MyTime() {
    }

    public int getTimeNumber() {
        return timeNumber;
    }

    public void setTimeNumber(int timeNumber) {
        this.timeNumber = timeNumber;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "MyTime{" + "timeNumber=" + timeNumber + ", time=" + time + '}';
    }

}
