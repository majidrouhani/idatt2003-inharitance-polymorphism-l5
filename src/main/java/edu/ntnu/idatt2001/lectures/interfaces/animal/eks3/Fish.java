package edu.ntnu.idatt2001.lectures.interfaces.animal.eks3;

public class Fish implements Swimable {

  @Override
  public void swim() {
    System.out.println("Fish is swimming...");
  }

  @Override
  public void move() {
    swim();
  }
}