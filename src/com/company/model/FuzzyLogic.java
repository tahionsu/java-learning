package com.company.model;

public class FuzzyLogic implements Model {

    @Override
    public String load_data(String path) {
        return "Создаем термы";
    }

    @Override
    public String fit() {
        return "Создаем базу правил";
    }

    @Override
    public String run() {
        return "Делаем нечеткий логический вывод";
    }
}
