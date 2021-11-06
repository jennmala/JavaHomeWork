package com.pb.malakhova.hw6;

import java.util.Objects;

public class Dog extends Animal {

    private String collar;

    public Dog(String name, String food, String location, String collar) {
        super(name, food, location);
        this.collar = collar;
    }

    public String getCollar() {
        return collar;
    }

    public void setCollar(String collar) {
        this.collar = collar;
    }

    @Override
    public void sleep () {
        System.out.println("Собака спит.");
    }

    @Override
    public void makeNoise () {
        System.out.println("Собака лает.");
    }

    @Override
    public void eat () {
        System.out.println("Собака кушает.");
    }

    @Override
    public String toString() {
        return "{" + getName() + ", кушает: " + getFood() + ", условия содержания: " + getLocation()
                + ", " + getCollar() + " ошейник" + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(collar, dog.collar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getFood(), getLocation(), collar);
    }
}
