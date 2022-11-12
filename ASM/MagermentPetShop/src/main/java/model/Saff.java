/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;

/**
 *
 * @author PC
 */
public class Saff {

    private String idSaff;
    private String nameSaff;
    private Date dateOfBirth;
    private String genther;
    private String address;
    private String email;
    private String role;
    private byte[] image;

    public Saff(String idSaff, String nameSaff, Date dateOfBirth, String genther, String address, String email, String role, byte[] image) {
        this.idSaff = idSaff;
        this.nameSaff = nameSaff;
        this.dateOfBirth = dateOfBirth;
        this.genther = genther;
        this.address = address;
        this.email = email;
        this.role = role;
        this.image = image;
    }

    public String getIdSaff() {
        return idSaff;
    }

    public void setIdSaff(String idSaff) {
        this.idSaff = idSaff;
    }

    public String getNameSaff() {
        return nameSaff;
    }

    public void setNameSaff(String nameSaff) {
        this.nameSaff = nameSaff;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGenther() {
        return genther;
    }

    public void setGenther(String genther) {
        this.genther = genther;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public Saff() {
    }

    @Override
    public String toString() {
        return "Saff{" + "idSaff=" + idSaff + ", nameSaff=" + nameSaff + ", dateOfBirth=" + dateOfBirth + ", genther=" + genther + ", address=" + address + ", email=" + email + ", role=" + role + ", image=" + image + '}';
    }

}
