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
public class Detail {
    private String idSaff;
    private Time beginTime;
    private Time finishTime;
    private int dayOfWeef;
    private float salaryOfHour;
    private float bonus;

    public Detail(String idSaff, Time beginTime, Time finishTime, int dayOfWeef, float salaryOfHour, float bonus) {
        this.idSaff = idSaff;
        this.beginTime = beginTime;
        this.finishTime = finishTime;
        this.dayOfWeef = dayOfWeef;
        this.salaryOfHour = salaryOfHour;
        this.bonus = bonus;
    }

    

    public Detail() {
    }

    public Time getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Time beginTime) {
        this.beginTime = beginTime;
    }

    public Time getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Time finishTime) {
        this.finishTime = finishTime;
    }

    public int getDayOfWeef() {
        return dayOfWeef;
    }

    public void setDayOfWeef(int dayOfWeef) {
        this.dayOfWeef = dayOfWeef;
    }

    public float getSalaryOfHour() {
        return salaryOfHour;
    }

    public void setSalaryOfHour(float salaryOfHour) {
        this.salaryOfHour = salaryOfHour;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    public String getIdSaff() {
        return idSaff;
    }

    public void setIdSaff(String idSaff) {
        this.idSaff = idSaff;
    }
    
    

    @Override
    public String toString() {
        return "Detail{" + "beginTime=" + beginTime + ", finishTime=" + finishTime + ", dayOfWeef=" + dayOfWeef + ", salaryOfHour=" + salaryOfHour + ", bonus=" + bonus + '}';
    }

}
