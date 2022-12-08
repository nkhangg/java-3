/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import ultil.Message;
import view.Form.MainFrom;

/**
 *
 * @author PC
 */
public class PersonalController implements ActionListener, MouseListener, KeyListener {

    private MainFrom view;

    public PersonalController(MainFrom view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        if (!view.getUser().getRole().equalsIgnoreCase("Admin")) {
//            Message.showWarning("You do not have access", view);
//            return;
//        }
        String src = e.getActionCommand();

        view.controllPerson(src);

        switch (src) {
            case "New":
                this.view.resetPerson();
                break;
            case "Find":
                view.findPerson();
                break;
            case "Add":
                view.handleAddPerson();
                break;
            case "Delete":
                view.deletePerson();
                break;
            case "Image":
                view.handleImagePerson();
                break;

            case "DetailPerson":
                view.handleDetail();
                break;
            default:
                break;
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        int index = view.getTblTablePerson().getSelectedRow();
        view.showSelectedPersonal(index, false);
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == 39) {
            view.controllPerson("Next");
        } else if (e.getKeyCode() == 37) {
            view.controllPerson("Prev");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

}
