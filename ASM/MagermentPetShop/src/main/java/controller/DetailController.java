/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import view.Form.DetailFrom;

/**
 *
 * @author PC
 */
public class DetailController implements ActionListener, WindowListener {

    private DetailFrom view;

    public DetailController(DetailFrom view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();

        switch (src) {
            case "Update":
                view.handleBtnUpdate();
                break;
            case "Total":
                view.handleTotal();
                break;
            case "Image":
                view.handleImagePerson();
                break;
            default:
                break;
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
        view.init();
    }

    @Override
    public void windowClosing(WindowEvent e) {
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }

}
