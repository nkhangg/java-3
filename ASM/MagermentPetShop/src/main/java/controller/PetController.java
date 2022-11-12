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
import view.Form.MainFrom;

/**
 *
 * @author PC
 */
public class PetController implements MouseListener, ActionListener, KeyListener {

    private MainFrom view;

    public PetController(MainFrom view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();

        view.controllPet(src);

        switch (src) {
            case "New":
                this.view.resetPet();
                break;
            case "Find":
                view.findPet();
                break;
            case "Add":
                view.handleInsertPet();
                break;
            case "Delete":
                view.deletePet();
                break;
            case "Image":
                view.handleImagePet();
                break;
            default:
                break;
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int index = view.getTblTablePet().getSelectedRow();
        view.showSelectedPet(index, false);
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
        System.out.println(e.getKeyCode());
        if (e.getKeyCode() == 39) {
            view.controllPet("Next");
        } else if (e.getKeyCode() == 37) {
            view.controllPet("Prev");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

}
