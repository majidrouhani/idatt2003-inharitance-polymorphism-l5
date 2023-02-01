package edu.ntnu.idatt2001.lectures.interfaces.animal.eks3;

public class Dog implements Walkable {
  public void walk() {
    System.out.println("Dog walks...");
  }

  @Override
  public void move() {
    walk();
  }
}