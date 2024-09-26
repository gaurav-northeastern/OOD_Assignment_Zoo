package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

public class ZooAnamalisticAnimals {
    private List<AnimalisticAPI> animals = new ArrayList<>();

    public void addAnimal(AnimalisticAPI animal) {
        animals.add(animal);
    }

    public void showAnimals() {
        for (AnimalisticAPI animal : animals) {
            System.out.println(animal);
            System.out.println(animal.speak());
        }
    }
}
