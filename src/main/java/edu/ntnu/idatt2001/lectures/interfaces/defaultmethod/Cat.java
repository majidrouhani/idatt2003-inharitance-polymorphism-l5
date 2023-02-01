package edu.ntnu.idatt2001.lectures.interfaces.defaultmethod;

public class Cat extends Animal implements Walkable {
  public Cat(String type) {
    super(type);
  }

  @Override
  public void move() {
    walk();
  }
  
  @Override
  public void walk() {
    System.out.println("Cat walks...");
  }
}
