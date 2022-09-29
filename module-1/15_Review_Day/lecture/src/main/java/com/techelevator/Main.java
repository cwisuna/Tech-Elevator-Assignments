package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

    }


    public List<Animal> getAnimals() {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("rhino", "Crash"));
        animals.add(new Animal("giraffe", "Tower"));
        animals.add(new Animal("elephant", "Herd"));
        animals.add(new Animal("lion", "Pride"));
        animals.add(new Animal("crow", "Murder"));
        animals.add(new Animal("pigeon", "Kit"));
        animals.add(new Animal("flamingo", "Pat"));
        animals.add(new Animal("deer", "Herd"));
        animals.add(new Animal("dog", "Pack"));
        animals.add(new Animal("crocodile", "Float"));

        return animals;
    }
}
