package com.company;

public class Cat extends Animal implements Printable {
    private String color;
    private int claws;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getClaws() {
        return claws;
    }

    public void setClaws(int claws) {
        this.claws = claws;
    }

    public Cat(String name, String color, int claws) {
        super(name);
        this.color = color;
        this.claws = claws;
    }


    @Override
    public Animal print() {

        System.out.println("Кличка: " + getName() + " Цвет: " + getColor() + " Длина когтей: " + claws);
        return null;
    }
}
