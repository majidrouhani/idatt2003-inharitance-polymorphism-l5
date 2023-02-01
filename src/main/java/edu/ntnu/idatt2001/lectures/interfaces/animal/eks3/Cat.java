package edu.ntnu.idatt2001.lectures.interfaces.animal.eks3;


public class Cat implements Walkable {
  @Override
  public void walk() {
    System.out.println("Cat walks...");
  }

  @Override
  public void move() {
    walk();    
  }
}
