package com.techelevator.farm;

import java.util.ArrayList;
import java.util.List;

public class OldMacdonald {
	public static void main(String[] args) {

		FarmAnimal[] farmAnimals = new FarmAnimal[] { new Cow(), new Chicken(), new Pig(), new Goat(), new Giraffe(), new Rabbit() };

//		for (FarmAnimal animal : farmAnimals) {
//			String name = animal.getName();
//			String sound = animal.getSound();
//			System.out.println("Old MacDonald had a farm, ee, ay, ee, ay, oh!");
//			System.out.println("And on his farm he had a " + name + ", ee, ay, ee, ay, oh!");
//			System.out.println("With a " + sound + " " + sound + " here");
//			System.out.println("And a " + sound + " " + sound + " there");
//			System.out.println("Here a " + sound + " there a " + sound + " everywhere a " + sound + " " + sound);
//			System.out.println();
//		}
//		List<Singable> singables =  new ArrayList<>();
//
//		for(FarmAnimal farmAnimal : farmAnimals){
//			if (farmAnimal instanceof  Singable){
//				singables.add( (Singable)farmAnimal);
//			}
//		}
//
//		singables.add(new Tractor());
//;
//		for (Singable animal : singables) {
//			String name = animal.getName();
//			String sound = animal.getSound();
//			System.out.println("Old MacDonald had a farm, ee, ay, ee, ay, oh!");
//			System.out.println("And on his farm he had a " + name + ", ee, ay, ee, ay, oh!");
//			System.out.println("With a " + sound + " " + sound + " here");
//			System.out.println("And a " + sound + " " + sound + " there");
//			System.out.println("Here a " + sound + " there a " + sound + " everywhere a " + sound + " " + sound);
//			System.out.println();
//		}


		Sellable[] sellables = new Sellable[]{ new Cow(), new Pig(), new Giraffe(), new Rabbit(), new Goat() };

		for(Sellable item : sellables) {
			//System.out.println("For Sale: " + item.getName());
			System.out.printf("For Sale: %s \nOnly $%.2f \n",item.getName() , item.getPrice());
		}

	}
}