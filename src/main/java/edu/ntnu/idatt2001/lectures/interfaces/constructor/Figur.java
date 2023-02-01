package edu.ntnu.idatt2001.lectures.interfaces.constructor;

public abstract class Figur {
  private final String color;

  public String getColor() {
    return color;
  }

  Figur(String color) {
    this.color = color;
  }

  public abstract double beregnAreal();

  @Override
  public String toString() {
    return "Figur [getColor()=" + getColor() + ", beregnAreal()=" + beregnAreal() + "]";
  }
}
