package edu.ntnu.idatt2001.lectures.generics.eks1;

public class Triangle {
  protected final double side1, side2, side3;

  public Triangle(double side1, double side2, double side3) {
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
  }

  public double calcArea() {
    return 0;
  }

  public double calcCircumference() {
    return this.side1 + this.side2 + this.side3;
  }

  @Override
  public String toString() {
    return "Trekant [side1=" + side1 + ", side2=" + side2 + ", side3=" + side3 + "]";
  }
}
