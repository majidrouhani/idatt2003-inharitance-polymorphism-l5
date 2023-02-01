package edu.ntnu.idatt2001.lectures.interfaces.defaultmethod;

import java.util.ArrayList;

public class App {

  
  /**
   * @param args
   */
  public static void main(final String args[]) {

    ArrayList<Moveable> animals = new ArrayList<Moveable>();
    animals.add(new Cat("Persian"));
    animals.add(new Dog("Chihuahua"));
    animals.add(new Bird("Owl"));
    animals.add(new Bird("Rooster"));

    for (Moveable animal : animals) {
      animal.move();
    }
  }
}
