package com.techelevator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    private static int i = 0;

    public static void main(String[] args) {
        List<Animal> animals = getAnimals();
//        while(animals.size() > 0){
//
//            Animal lastAnimal = animals.get(animals.size() -1 );
//            if (lastAnimal.getName().equals("giraffe")){
//                break;
//            }
//            animals.remove(lastAnimal);
//            System.out.println("Remaining animals " + animals.size());
//        }

        for (Animal animal : animals){
            if (animal.getName().equals("giraffe")){
                continue;
            }

            System.out.printf("%s  %s\n", animal.getName(), animal.getFamily());
            if(true){
                System.out.println("print this");
            }
        }
    }


    public static List<Animal> getAnimals() {
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
