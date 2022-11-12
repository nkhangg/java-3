/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import dao.DAOPet;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class ManagermentPetModel {

    ArrayList<Pet> list = DAOPet.getInstand().selectAll();

    public ManagermentPetModel() {
    }

    public ArrayList<Pet> getList() {
        return list;
    }

    public void setList(ArrayList<Pet> list) {
        this.list = list;
    }

    public boolean insert(Pet us) {
        boolean result = DAOPet.getInstand().insert(us);
        if (result) {
            list = DAOPet.getInstand().selectAll();
        }
        return result;
    }

    public boolean update(Pet us) {
        boolean result = DAOPet.getInstand().update(us);
        if (result) {
            list = DAOPet.getInstand().selectAll();
        }
        return result;
    }

    public boolean delete(Pet us) {
        boolean result = DAOPet.getInstand().delete(us);
        if (result) {
            list = DAOPet.getInstand().selectAll();
        }
        return result;
    }

    public Pet findById(String id) {
        return DAOPet.getInstand().selectById(id).getIdPet() > 0 ? DAOPet.getInstand().selectById(id) : null;
    }

    public boolean selectAllCondition(String condition) {
        if (DAOPet.getInstand().selectByConditon(condition) != null) {
            list = DAOPet.getInstand().selectByConditon(condition);
            return true;

        }
        return false;
    }

//    public static void main(String[] args) {
//        ManagermentPetModel model = new ManagermentPetModel();
//        for (Pet p : model.getList()) {
//            System.out.println(p.toString());
//        }
//    }

}
