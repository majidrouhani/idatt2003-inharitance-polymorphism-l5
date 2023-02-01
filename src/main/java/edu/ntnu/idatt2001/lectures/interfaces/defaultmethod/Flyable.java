package edu.ntnu.idatt2001.lectures.interfaces.defaultmethod;

public interface Flyable extends Moveable {
  default void fly() {
    System.out.println("Old method for flying...");
  }

  default void fly(String name) {
    System.out.println("New method for flying...");
  }
}
