package com.pb.malakhova.hw6;

public class Animal {

    private String name;
    private String food;
    private String location;

    public Animal(String name, String food, String location) {
        this.name = name;
        this.food = food;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void sleep () {
        System.out.println("Животное спит.");
    }

    public void makeNoise () {
        System.out.println("Животное шумит.");
    }

    public void eat () {
        System.out.println("Животное кушает.");
    }

    public void treatAnimal(Animal animal) {
        System.out.println(animal.getName() + " кушает: " + animal.getFood() + ", условия содержания: " + animal.getLocation());
    }

}
