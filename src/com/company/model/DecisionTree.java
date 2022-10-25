package com.company.model;

public class DecisionTree implements Model {
    @Override
    public String load_data(String path) {
        return "Загружаем обучающие данные для деревьев решений";
    }

    @Override
    public String fit() {
        return "Обучаем деревья решений";
    }

    @Override
    public String run() {
        return "Логический вывод на основе деревьев решений";
    }
}
