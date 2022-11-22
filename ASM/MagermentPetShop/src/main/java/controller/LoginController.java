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
import view.Form.LoandingFrom;
import view.Form.LoginFrom;
import view.Form.MainFrom;

/**
 *
 * @author PC
 */
public class LoginController implements MouseListener, ActionListener, KeyListener {

    private LoginFrom view;

    public LoginController(LoginFrom view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();

        switch (src) {
            case "login":
                handleLLogin();
                break;
            default:
                break;
        }
    }

    public void handleLLogin() {
//        if (view.login()) {
//            new LoandingFrom(view.createUser());
//            view.setVisible(false);
//            view.dispose();
//        }

        new LoandingFrom(view.createUser());
        view.setVisible(false);
        view.dispose();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        view.dispose();
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
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            handleLLogin();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

}
