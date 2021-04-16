package com.company;

public class Dog extends Animal implements Printable {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Dog(String name, String color) {
        super(name);
        this.color = color;
    }

    @Override
    public Animal print() {
        System.out.println("Кличка: " + getName() + " Цвет: " + getColor());
        return null;
    }
}
