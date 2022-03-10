package com.company;

public class Parrot {
    private String name;
    private int age;
    private String whereFrom;
    private double weight;

    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }

    void setWhereFrom(String whereFrom) {
        this.whereFrom = whereFrom;
    }

    void setWeight(double weight) {
        this.weight = weight;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    String getWhereFrom() {
        return whereFrom;
    }

    double getWeight() {
        return weight;
    }
}