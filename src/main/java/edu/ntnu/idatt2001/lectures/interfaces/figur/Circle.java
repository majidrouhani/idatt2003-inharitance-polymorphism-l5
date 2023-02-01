package edu.ntnu.idatt2001.lectures.interfaces.figur;

public class Circle implements Paintable {
  private String farge;

  public Circle(String farge) {
    this.farge = farge;
  }

  @Override
  public void paint() {
    System.out.println("Painting circle..." + farge);
  }

}
