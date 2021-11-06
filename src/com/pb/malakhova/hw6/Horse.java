package com.pb.malakhova.hw6;

import java.util.Objects;

public class Horse extends Animal {

    private String harness;

    public Horse(String name, String food, String location, String harness) {
        super(name, food, location);
        this.harness = harness;
    }

    public String getHarness() {
        return harness;
    }

    public void setHarness(String harness) {
        this.harness = harness;
    }

    @Override
    public void sleep () {
        System.out.println("Лошадь спит.");
    }

    @Override
    public void makeNoise () {
        System.out.println("Лошадь ржет.");
    }

    @Override
    public void eat () {
        System.out.println("Лошадь кушает.");
    }

    @Override
    public String toString() {
        return "{" + getName() + ", кушает: " + getFood() + ", условия содержания: " + getLocation()
                + ", " + " сбруя: " + getHarness() + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horse horse = (Horse) o;
        return Objects.equals(harness, horse.harness);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getFood(), getLocation(), harness);
    }
}
