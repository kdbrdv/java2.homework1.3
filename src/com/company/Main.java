package com.company;

public class Main {
    private static Animal createObject(String className) {

            switch (className) {
                case ("Bird"):
                    return new Bird("Vorobey", 7).print();
                case ("Cat"):
                    return new Cat("Leopold", "White", 3).print();
                case ("Dog"):
                    return new Dog("Bobik", "black").print();
            }
            return new Animal();
        }

        public static void main (String[]args){
            createObject("Dog");
            createObject("Cat");
            createObject("Bird");

        }
    }
