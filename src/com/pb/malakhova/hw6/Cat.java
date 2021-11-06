package com.pb.malakhova.hw6;

import java.util.Objects;

public class Cat extends Animal {

    private String toy;

    public Cat(String name, String food, String location, String toy) {
        super(name, food, location);
        this.toy = toy;
    }

    public String getToy() {
        return toy;
    }

    public void setToy(String toy) {
        this.toy = toy;
    }

    @Override
    public void sleep () {
        System.out.println("Кот спит.");
    }

    @Override
    public void makeNoise () {
        System.out.println("Кот мяукает.");
    }

    @Override
    public void eat () {
        System.out.println("Кот кушает.");
    }

    @Override
    public String toString() {
        return "{" + getName() + ", кушает: " + getFood() + ", условия содержания: " + getLocation()
                + ", " + " любимая игрушка: " + getToy() + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(toy, cat.toy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getFood(), getLocation(), toy);
    }
}
