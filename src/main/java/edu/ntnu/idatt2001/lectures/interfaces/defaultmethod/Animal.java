package edu.ntnu.idatt2001.lectures.interfaces.defaultmethod;

public abstract class Animal {
  private final String type;

  public String getType() {
    return type;
  }

  Animal(String type) {
    super();
    this.type = type;
  }

  @Override
  public String toString() {
    return "Animal [type=" + type + "]";
  }
}
