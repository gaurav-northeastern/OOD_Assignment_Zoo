package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

public class ZooAbstractAnimals {
    private List<AbstractAnimalAPI> animals = new ArrayList<>();

    public void addAnimal(AbstractAnimalAPI animal) {
        animals.add(animal);
    }

    public void showAnimals() {
        for (AbstractAnimalAPI animal : animals) {
            System.out.println(animal);
            System.out.println(animal.speak());
        }
    }
}
