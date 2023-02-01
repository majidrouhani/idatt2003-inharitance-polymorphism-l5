package edu.ntnu.idatt2001.lectures.generics.eks1;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {
  private static final Logger log = Logger.getLogger(App.class.getName());

  public static void main(String[] args) {

    ArrayList<Triangle> trekanter = new ArrayList<Triangle>();

    trekanter.add(new IsoscelesTriangle(10, 15));
    trekanter.add(new EquilateralTriangle(5));
    trekanter.add(new RightTriangle(7, 11));

    for (Triangle trekant : trekanter) {
      log.log(Level.INFO, "{0}", trekant.calcArea());
    }
  }
}
