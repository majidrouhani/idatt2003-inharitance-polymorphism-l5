package edu.ntnu.idatt2001.lectures.interfaces.animal.eks3;

import java.util.ArrayList;

public class App {

  /**
   * @param args
   */
  public static void main(final String[] args) {

    ArrayList<Moveable> animals = new ArrayList<Moveable>();
    animals.add(new Cat());
    animals.add(new Dog());
    animals.add(new Bird());
    animals.add(new Fish());

    for (Moveable animal : animals) {
      animal.move();
    }
  }
}
