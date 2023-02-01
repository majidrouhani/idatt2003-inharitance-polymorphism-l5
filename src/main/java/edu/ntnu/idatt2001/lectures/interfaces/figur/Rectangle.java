package edu.ntnu.idatt2001.lectures.interfaces.figur;

public class Rectangle implements Paintable {
  private String farge;

  public Rectangle(String farge) {
    this.farge = farge;
  }

  @Override
  public void paint() {
    System.out.println("Painting rectangle..." + farge);
  }
}
