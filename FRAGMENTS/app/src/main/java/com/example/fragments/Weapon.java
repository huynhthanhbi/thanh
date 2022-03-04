package com.example.fragments;

public class Weapon {


    private String category;
    private String name;
    private int dame;
    private int power;
    public Weapon(String category,String name, int dame, int power) {
        this.category = category;
        this.name = name;
        this.dame = dame;
        this.power = power;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDame() {
        return dame;
    }

    public void setDame(int dame) {
        this.dame = dame;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }



}
