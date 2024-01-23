package edu.ntnu.idatt2003.lectures.generics.eks1;

public class RightTriangle extends Triangle {

  public RightTriangle(double g, double h) {
    super(g, h, Math.sqrt(Math.pow(g, 2) + Math.pow(h, 2)));
  }

  
  
  @Override public double calcArea() { 
    return Math.round(this.a * this.b / 2); 
  }

   
  @Override
  public String toString() {
    return "RettvinkletTrekant [g=" + this.a + ", h=" + this.b + ", getAreal()="
        + calcArea() + ", getOmkrets()=" + calcCircumference() + "]";
  }
}
