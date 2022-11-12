/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author PC
 */
public class Pet {

    private int idPet;
    private String namePet;
    private int age;
    private float weight;
    private String type;
    private String genther;
    private String color;
    private float price;
    private byte[] image;

    public Pet(int idPet, String namePet, int age, float weight, String type, String genther, String color, float price, byte[] image) {
        this.idPet = idPet;
        this.namePet = namePet;
        this.age = age;
        this.weight = weight;
        this.type = type;
        this.genther = genther;
        this.color = color;
        this.price = price;
        this.image = image;
    }

    public Pet(String namePet, int age, float weight, String type, String genther, String color, float price, byte[] image) {
        this.namePet = namePet;
        this.age = age;
        this.weight = weight;
        this.type = type;
        this.genther = genther;
        this.color = color;
        this.price = price;
        this.image = image;
    }
    
    

    public Pet() {
    }

    public int getIdPet() {
        return idPet;
    }

    public void setIdPet(int idPet) {
        this.idPet = idPet;
    }

    public String getNamePet() {
        return namePet;
    }

    public void setNamePet(String namePet) {
        this.namePet = namePet;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGenther() {
        return genther;
    }

    public void setGenther(String genther) {
        this.genther = genther;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Pet{" + "idPet=" + idPet + ", namePet=" + namePet + ", age=" + age + ", weight=" + weight + ", type=" + type + ", genther=" + genther + ", color=" + color + ", price=" + price + ", image=" + image + '}';
    }

}
