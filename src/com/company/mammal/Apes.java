package com.company.mammal;

public class Apes extends Mammal {

    public Apes(String name, double weight, double height) {
        super(name, weight, height);
    }

    @Override
    public String move() {
        return "Лазает";
    }

    @Override
    public String eat() {
        return "Ест бананы";
    }
}
