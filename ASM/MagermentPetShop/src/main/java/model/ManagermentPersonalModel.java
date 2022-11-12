/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import dao.DAOPet;
import dao.DAOSaff;
import java.text.ParseException;
import java.util.ArrayList;
import ultil.Fomart;

/**
 *
 * @author PC
 */
public class ManagermentPersonalModel {
    
    ArrayList<Saff> list = DAOSaff.getInstand().selectAll();
    
    public ManagermentPersonalModel() {
    }
    
    public ArrayList<Saff> getList() {
        return list;
    }
    
    public void setList(ArrayList<Saff> list) {
        this.list = list;
    }
    
    public boolean insert(Saff us) {
        boolean result = DAOSaff.getInstand().insert(us);
        if (result) {
            list = DAOSaff.getInstand().selectAll();
        }
        return result;
    }
    
    public boolean update(Saff us) {
        boolean result = DAOSaff.getInstand().update(us);
        if (result) {
            list = DAOSaff.getInstand().selectAll();
        }
        return result;
    }
    
    public boolean delete(Saff us) {
        boolean result = DAOSaff.getInstand().delete(us);
        if (result) {
            list = DAOSaff.getInstand().selectAll();
        }
        return result;
    }
    
    public Saff findById(String id) {
        return DAOSaff.getInstand().selectById(id).getIdSaff() != null ? DAOSaff.getInstand().selectById(id) : null;
    }
    
    public boolean selectAllCondition(String condition) {
        if (DAOPet.getInstand().selectByConditon(condition) != null) {
            list = DAOSaff.getInstand().selectByConditon(condition);
            return true;
            
        }
        return false;
    }
    
//    public static void main(String[] args) throws ParseException {
//        ManagermentPersonalModel model = new ManagermentPersonalModel();
//        
//        for (int i = 1; i <= 20; i++) {
//            boolean p = model.insert(new Saff("NV00" + i, "Khang " + i, Fomart.convertDate("12/2/2003"), i % 2 == 0 ? "Female" : "Male", "Hau giang", "Khang@gmail.com", i % 2 == 0 ? "Manager" : "Admin", null));
//        }
//
//        for (Saff p : model.getList()) {
//            System.out.println(p.toString());
//        }
//    }
}
