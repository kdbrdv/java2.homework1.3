package com.company;

public class Bird extends Animal implements Printable {
    private int wings;

    public int getWings() {
        return wings;
    }

    public void setWings(int wings) {
        this.wings = wings;
    }

    public Bird(String name, int wings) {
        super.setName(name);
        this.wings = wings;
    }

    @Override
    public Animal print() {
        System.out.println("Название: " + getName() + " Размах крыльев: " + wings);
        return null;
    }
}
