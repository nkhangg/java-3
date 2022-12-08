/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import dao.DAODetail;

/**
 *
 * @author PC
 */
public class ModalDetail {

    public ModalDetail() {
    }

    public Detail getDetail(String id) {
        Detail dt = DAODetail.getInstand().selectById(id);
        return dt;
    }

    public boolean update(Detail dt) {
        return DAODetail.getInstand().update(dt);
    }

    public boolean insert(Detail dt) {
        return DAODetail.getInstand().insert(dt);
    }
}
