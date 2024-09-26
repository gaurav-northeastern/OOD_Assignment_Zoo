package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

public class ZooObjectAnimals {
    private List<Object> animals = new ArrayList<>();

    public void addAnimal(Object animal) {
        animals.add(animal);
    }

    public void showAnimals() {
        for (Object animal : animals) {
            System.out.println(animal);
            if (animal instanceof AnimalAPI) {
                System.out.println(((AnimalAPI) animal).speak());
            } else if (animal instanceof AbstractAnimalAPI) {
                System.out.println(((AbstractAnimalAPI) animal).speak());
            } else if (animal instanceof AnimalisticAPI) {
                System.out.println(((AnimalisticAPI) animal).speak());
            }
        }
    }
}
