/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import ultil.Message;
import view.Form.LoginFrom;
import view.Form.MainFrom;

/**
 *
 * @author PC
 */
public class MainController implements WindowListener, ActionListener {

    private MainFrom view;

    public MainController(MainFrom view) {
        this.view = view;
    }

    public void handleLogout() {
        if (Message.showSelected("Do you want to escape?", view)) {
            view.dispose();
            new LoginFrom().setVisible(true);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        view.showComponent(src);

        switch (src) {
            case "btnNavHome":
                view.showHome();
                break;

            case "Log out":
                handleLogout();
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
