package edu.ntnu.idatt2001.lectures.generics.eks1;

public class IsoscelesTriangle extends Triangle {
  public IsoscelesTriangle(double g, double s) {
    super(g, s, s);
  }

  @Override
  public double calcArea() {
    double h = Math.sqrt(Math.pow(this.b, 2) - Math.pow(this.a, 2) / 4);
    return Math.round(h * this.a / 4);
  }

  @Override
  public String toString() {
    return "LikebenetTrekant [g=" + this.a + ", s=" + this.b + ", getAreal()=" + calcArea()
        + ", getOmkrets()=" + calcCircumference() + "]";
  }
}
