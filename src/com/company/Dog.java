package com.company;

public class Dog {
    private String name;
    private int age;
    private String species;
    private int weight;

    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }

    void setSpecies(String species) {
        this.species = species;
    }

    void setWeight(int weight) {
        this.weight = weight;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    String getSpecies() {
        return species;
    }

    int getWeight() {
        return weight;
    }
}