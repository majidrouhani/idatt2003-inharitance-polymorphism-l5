package edu.ntnu.idatt2001.lectures.interfaces.animal.eks0;

public class Cat extends Animal {
  private final int NO_LEGS = 4;
  public void eat() {
    System.out.println("Cat eats");
  }

  public void walk() {
    System.out.println("Cat walks");
  }

  public int noOfLegs() {
    return NO_LEGS;
  }
}
