package edu.neu.csye6200;

public class driver {
    public static void main(String[] args) {
        // ZooAnimals: Using AnimalAPI (Concrete)
        ZooAnimals zooAnimals = new ZooAnimals();
        zooAnimals.addAnimal(new LionAPI());
        zooAnimals.addAnimal(new ElephantAPI());
        zooAnimals.addAnimal(new SnakeAPI());
        System.out.println("ZooAnimals:");
        zooAnimals.showAnimals();

        // ZooAbstractAnimals: Using AbstractAnimalAPI
        ZooAbstractAnimals zooAbstractAnimals = new ZooAbstractAnimals();
        zooAbstractAnimals.addAnimal(new LionAbstract());
        zooAbstractAnimals.addAnimal(new ElephantAbstract());
        zooAbstractAnimals.addAnimal(new SnakeAbstract());
        System.out.println("\nZooAbstractAnimals:");
        zooAbstractAnimals.showAnimals();

        // ZooAnamalisticAnimals: Using AnimalisticAPI (Interface)
        ZooAnamalisticAnimals zooAnamalisticAnimals = new ZooAnamalisticAnimals();
        zooAnamalisticAnimals.addAnimal(new LionAnimalistic());
        zooAnamalisticAnimals.addAnimal(new ElephantAnimalistic());
        zooAnamalisticAnimals.addAnimal(new SnakeAnimalistic());
        System.out.println("\nZooAnamalisticAnimals:");
        zooAnamalisticAnimals.showAnimals();

        // ZooObjectAnimals: Using Object API (Demonstrating all APIs)
        ZooObjectAnimals zooObjectAnimals = new ZooObjectAnimals();
        zooObjectAnimals.addAnimal(new LionAPI());
        zooObjectAnimals.addAnimal(new ElephantAbstract());
        zooObjectAnimals.addAnimal(new SnakeAnimalistic());
        System.out.println("\nZooObjectAnimals:");
        zooObjectAnimals.showAnimals();
    }
}
