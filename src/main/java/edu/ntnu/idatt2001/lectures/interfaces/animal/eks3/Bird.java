package edu.ntnu.idatt2001.lectures.interfaces.animal.eks3;


public class Bird implements Flyable {

  @Override
  public void fly() {
    System.out.println("Bird flies...");
  }

  @Override
  public void move() {
    fly();
  }
}
