package com.company.main;

import com.company.mammal.*;
import com.company.model.*;

public class Main {
    public static void main(String[] args) {
        Mammal[] mammals = new Mammal[3];
        mammals[0] = new Mammal("Whale", 5000, 2000);
        mammals[1] = new Apes("Marcel", 40, 5);
        mammals[2] = new Parropods("Murka", 500, 150);

        for (int i = 0; i < mammals.length; i++) {
            System.out.println(mammals[i].move());
            System.out.println(mammals[i].eat());
        }

        NeuralNetwork neuralNet = new NeuralNetwork();
        FuzzyLogic fuzzySet = new FuzzyLogic();
        DecisionTree tree = new DecisionTree();

        System.out.println(neuralNet.load_data("/src/"));
        System.out.println(neuralNet.fit());
        System.out.println(neuralNet.run());

        System.out.println(fuzzySet.load_data("/src/"));
        System.out.println(fuzzySet.fit());
        System.out.println(fuzzySet.run());

        System.out.println(tree.load_data("/src/"));
        System.out.println(tree.fit());
        System.out.println(tree.run());
    }
}
