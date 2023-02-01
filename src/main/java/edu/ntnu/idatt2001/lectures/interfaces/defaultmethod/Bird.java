package edu.ntnu.idatt2001.lectures.interfaces.defaultmethod;

public class Bird extends Animal implements Flyable, Walkable {
  private final String ROOSTER = "Rooster";

  public Bird(String type) {
    super(type);
  }

  @Override
  public void move() {
    fly(this.getType());
  }

  @Override
  public void fly(String name) {
    if (this.ROOSTER.equalsIgnoreCase(name)) {
      walk();
    } else {
      System.out.println(name.concat(" is flying!"));
    }
  }

  @Override
  public void walk() {
    System.out.println(this.getType().concat(" walks..."));
  }
}
