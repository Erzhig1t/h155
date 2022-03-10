package com.company;

public class Cat {
    private String name;
    private int age;
    private String colour;
    private String gender;

    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }

    void setColour(String colour) {
        this.colour = colour;
    }

    void setGender(String gender) {
        this.gender = gender;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    String getColour() {
        return colour;
    }

    String getGender() {
        return gender;
    }
}