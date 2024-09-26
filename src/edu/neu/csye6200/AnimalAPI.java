package edu.neu.csye6200;

public class AnimalAPI {
    public String speak() {
        return "Animal sound";
    }

    @Override
    public String toString() {
        return "This is an animal from AnimalAPI.";
    }
}

class LionAPI extends AnimalAPI {
    @Override
    public String speak() {
        return "Lion roars";
    }

    @Override
    public String toString() {
        return "Lion from AnimalAPI.";
    }
}

class ElephantAPI extends AnimalAPI {
    @Override
    public String speak() {
        return "Elephant trumpets";
    }

    @Override
    public String toString() {
        return "Elephant from AnimalAPI.";
    }
}

class SnakeAPI extends AnimalAPI {
    @Override
    public String speak() {
        return "Snake hisses";
    }

    @Override
    public String toString() {
        return "Snake from AnimalAPI.";
    }
}
