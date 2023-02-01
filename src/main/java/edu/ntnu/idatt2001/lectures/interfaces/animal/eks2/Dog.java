package edu.ntnu.idatt2001.lectures.interfaces.animal.eks2;

public class Dog implements Animal, Comparable<Animal> {
  private final int NO_LEGS = 4;

  public void eat() {
    System.out.println("Dog eats");
  }

  public void walk() {
    System.out.println("Dog travels");
  }

  public int noOfLegs() {
    return NO_LEGS;
  }

  @Override
  public int compareTo(Animal a) {
    if (this.noOfLegs() == ((Animal) a).noOfLegs()) {
      return 1;
    } else {
      return -1;
    }
  }
}