package edu.ntnu.idatt2001.lectures.generics.eks3;

import java.util.logging.Level;
import java.util.logging.Logger;

public class App {

  private static final Logger log = Logger.getLogger(App.class.getName());

  public static void main(String args[]) {

    Computer<Integer, Integer> adderInt = new Computer<Integer, Integer>() {
      @Override
      public Integer compute(Integer t1, Integer t2) {
        return t1 + t2;
      }
    };

    Computer<Double, Double> adderDouble = new Computer<Double, Double>() {
      @Override
      public Double compute(Double t1, Double t2) {
        return t1 + t2;
      }
    };

    Computer<String, String> adderStr = new Computer<String, String>() {
      @Override
      public String compute(String t1, String t2) {
        return t1.concat(t2);
      }
    };

    Computer<Double, Double> multiplyDouble = new Computer<Double, Double>() {
      @Override
      public Double compute(Double t1, Double t2) {
        return t1*t2;
      }
    };

    log.log(Level.INFO, "{0}", adderStr.compute("anonymous ", "class"));
    log.log(Level.INFO, "{0}", adderInt.compute(100, 50));
    log.log(Level.INFO, "{0}", adderDouble.compute(100.5, 50.1));
    log.log(Level.INFO, "{0}", multiplyDouble.compute(5.3, 20.0));
  }
}
