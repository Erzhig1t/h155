package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(" FISH ");
        Fish fish = new Fish();
        fish.setSpecies("Форель");
        fish.setPrice(250);
        System.out.println("Балыктын туру: " + fish.getSpecies());
        System.out.println("Баасы: " + fish.getPrice());

        System.out.println("\n PARROT ");
       Parrot parrot = new Parrot();
        parrot .setName("Billy");
        parrot .setAge(5);
        parrot .setWeight(0.2);
        parrot.setWhereFrom("England");
        System.out.println("NAME: " + parrot.getAge());
        System.out.println("Age: " + parrot.getAge());
        System.out.println("Weight: " + parrot.getWeight());
        System.out.println("Where is it from: " + parrot.getWhereFrom());

        System.out.println("\n CAT ");
        Cat cat = new Cat();
        cat.setName("Tom");
        cat.setAge(3);
        cat.setColour("White");
        cat.setGender("Female");
        System.out.println("Name: " + cat.getName());
        System.out.println("Age: " + cat.getAge());
        System.out.println("Colour: " + cat.getColour());
        System.out.println("Gender: " + cat.getGender());

        System.out.println("\n DOG ");
        Dog dog = new Dog();
        dog.setName("Bob");
        dog.setAge(6);
        dog.setSpecies("Alabay");
        dog.setWeight(20);
        System.out.println("Name: " + dog.getName());
        System.out.println("Age: " + dog.getAge());
        System.out.println("Species: " + dog.getSpecies());
        System.out.println("Weight: " + dog.getWeight());
    }
}
