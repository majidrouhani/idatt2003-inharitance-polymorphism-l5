package edu.ntnu.idatt2003.lectures.generics.eks1;

public class EquilateralTriangle extends Triangle {
  public EquilateralTriangle(double s) {
    super(s, s, s);
  }

  @Override
  public double calcArea() {
    return Math.round(Math.sqrt(3) / 4 * Math.pow(this.a, 2));
  }

  @Override
  public String toString() {
    return "LikesidetTrekant [s=" + this.a + ", getAreal()=" + calcArea() + ", getOmkrets()="
        + calcCircumference() + "]";
  }

}
