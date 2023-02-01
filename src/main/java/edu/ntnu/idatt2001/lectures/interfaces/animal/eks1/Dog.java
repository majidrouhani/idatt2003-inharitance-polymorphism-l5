package edu.ntnu.idatt2001.lectures.interfaces.animal.eks1;

public class Dog implements Animal {
  private final int NO_LEGS = 4;

  public void eat() {
    System.out.println("Dog eats");
  }

  public void walk() {
    System.out.println("Dog walks");
  }

  public int noOfLegs() {
    return NO_LEGS;
  }
}