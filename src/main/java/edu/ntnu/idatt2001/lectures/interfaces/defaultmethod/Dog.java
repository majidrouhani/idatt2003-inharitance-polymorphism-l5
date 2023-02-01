package edu.ntnu.idatt2001.lectures.interfaces.defaultmethod;

public class Dog extends Animal implements Walkable {
  public Dog(String type) {
    super(type);
  }

  @Override
  public void move() {
    walk();
  }

  @Override
  public void walk() {
    System.out.println("Dog walks...");
  }
}