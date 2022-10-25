package com.company.mammal;

public class Parropods extends Mammal {

    public Parropods(String name, double weight, double height) {
        super(name, weight, height);
    }

    @Override
    public String move() {
        return "Скачет";
    }

    @Override
    public String eat() {
        return "Ест траву";

    }
}
