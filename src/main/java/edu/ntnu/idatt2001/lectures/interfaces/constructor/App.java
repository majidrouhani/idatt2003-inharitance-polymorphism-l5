package edu.ntnu.idatt2001.lectures.interfaces.constructor;

import java.util.logging.Level;
import java.util.logging.Logger;

public class App {
  private static final Logger log = Logger.getLogger(App.class.getName());

  public static void main(String[] args) {
    Figur f = new Figur("Red") {

      @Override
      public double beregnAreal() {
        return 20;
      }
    };

    log.log(Level.INFO, "{0}", f);    
  }
}
