package com.pb.malakhova.hw6;

import java.lang.reflect.Constructor;

public class VetСlinic {
    public static void main(String[] args) {
        Dog dog = new Dog("Собака Моника", "Pedigree", "Частный дом", "коричневый");
        Cat cat = new Cat("Кот Тимофей", "ProPlan", "Квартира", "Рыбка");
        Horse horse = new Horse("Лошадь Мэри", "овес", "конюшня", "уздечка и седло");

        System.out.println(dog.toString());

        System.out.println(cat.toString());

        System.out.println(horse.toString());

        Animal[] animals = new Animal[]{dog, cat, horse};
        for (Animal animal : animals) {
            animal.treatAnimal(animal);
        }
    }
}







//        Class Veterinarian = Class.forName("com.pb.malakhova.hw6.Animal");
//        Constructor constr = Veterinarian.getConstructor(new Class[] {String.class});
//            Object obj = constr.newInstance("Собака Моника");
//            if (obj instanceof Animal) {
//                (Animal obj).treatAnimal();
//            }