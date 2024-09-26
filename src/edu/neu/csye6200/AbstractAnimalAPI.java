package edu.neu.csye6200;

public abstract class AbstractAnimalAPI {
    public abstract String speak();

    @Override
    public String toString() {
        return "This is an animal from AbstractAnimalAPI.";
    }
}

class LionAbstract extends AbstractAnimalAPI {
    @Override
    public String speak() {
        return "Lion roars";
    }

    @Override
    public String toString() {
        return "Lion from AbstractAnimalAPI.";
    }
}

class ElephantAbstract extends AbstractAnimalAPI {
    @Override
    public String speak() {
        return "Elephant trumpets";
    }

    @Override
    public String toString() {
        return "Elephant from AbstractAnimalAPI.";
    }
}

class SnakeAbstract extends AbstractAnimalAPI {
    @Override
    public String speak() {
        return "Snake hisses";
    }

    @Override
    public String toString() {
        return "Snake from AbstractAnimalAPI.";
    }
}

