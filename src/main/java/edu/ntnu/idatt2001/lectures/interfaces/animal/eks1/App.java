package edu.ntnu.idatt2001.lectures.interfaces.animal.eks1;

import java.util.ArrayList;

public class App {

  public static void main(String args[]) {

    Dog d = new Dog();

    d.eat();
    d.walk();

    Cat c = new Cat();
    c.eat();
    c.walk();

    Animal animalDog = new Dog();

    animalDog.eat();
    animalDog.walk();

    Animal animalCat = new Cat();
    animalCat.eat();
    animalCat.walk();

    ArrayList<Animal> animals = new ArrayList<Animal>();
    animals.add(animalDog);
    animals.add(animalCat);

    for (Animal animal : animals) {
      animal.eat();
      animal.walk();
    }
  }
}
