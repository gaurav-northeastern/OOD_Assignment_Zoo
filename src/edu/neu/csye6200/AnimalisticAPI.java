package edu.neu.csye6200;

public interface AnimalisticAPI {
    String speak();

    @Override
    String toString();
}

class LionAnimalistic implements AnimalisticAPI {
    @Override
    public String speak() {
        return "Lion roars";
    }

    @Override
    public String toString() {
        return "Lion from AnimalisticAPI.";
    }
}

class ElephantAnimalistic implements AnimalisticAPI {
    @Override
    public String speak() {
        return "Elephant trumpets";
    }

    @Override
    public String toString() {
        return "Elephant from AnimalisticAPI.";
    }
}

class SnakeAnimalistic implements AnimalisticAPI {
    @Override
    public String speak() {
        return "Snake hisses";
    }

    @Override
    public String toString() {
        return "Snake from AnimalisticAPI.";
    }
}
