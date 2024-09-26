package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

public class ZooAnimals {
    private List<AnimalAPI> animals = new ArrayList<>();

    public void addAnimal(AnimalAPI animal) {
        animals.add(animal);
    }

    public void showAnimals() {
        for (AnimalAPI animal : animals) {
            System.out.println(animal);
            System.out.println(animal.speak());
        }
    }
}
