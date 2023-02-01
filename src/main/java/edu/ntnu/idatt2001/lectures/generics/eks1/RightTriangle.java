package edu.ntnu.idatt2001.lectures.generics.eks1;

public class RightTriangle extends Triangle {

  public RightTriangle(double g, double h) {
    super(g, h, Math.sqrt(Math.pow(g, 2) + Math.pow(h, 2)));
  }

  @Override
  public String toString() {
    return "RettvinkletTrekant [g=" + this.side1 + ", h=" + this.side2 + ", getAreal()="
        + calcArea() + ", getOmkrets()=" + calcCircumference() + "]";
  }
}
