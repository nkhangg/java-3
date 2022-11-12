/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public interface DAOInterface<T> {

    public boolean insert(T t);

    public boolean update(T t);

    public boolean delete(T t);

    public ArrayList<T> selectAll();

    public T selectById(String t);
    
    public ArrayList<T> selectByConditon(String condition);

}
