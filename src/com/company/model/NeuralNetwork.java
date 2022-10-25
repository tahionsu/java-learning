package com.company.model;

public class NeuralNetwork implements Model {

    @Override
    public String load_data(String path) {
        return "Загружаем обучающие данные для нейросети"
    }

    @Override
    public String fit() {
        return "Обучаем нейросеть";
    }

    @Override
    public String run() {
        return "Делаем логический вывод нейронной сети";
    }
}
