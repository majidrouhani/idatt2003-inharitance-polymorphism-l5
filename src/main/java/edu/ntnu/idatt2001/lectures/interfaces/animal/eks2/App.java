package edu.ntnu.idatt2001.lectures.interfaces.animal.eks2;

import java.util.logging.Level;
import java.util.logging.Logger;

public class App {
  private static final Logger log = Logger.getLogger(App.class.getName());

  public static void main(String args[]) {

    // Have Dog and Cat same number of legs?

    Comparable<Animal> cDog = new Dog();
    Comparable<Animal> cCat = new Cat();

    log.log(Level.INFO, "{0}", cDog.compareTo((Animal) cCat) >0 ? "Same number of legs" : "Different number of legs");
    
    Comparable<Animal> cRooster = new Rooster();

    log.log(Level.INFO, "{0}", cDog.compareTo((Animal) cRooster) > 0 ? "Same number of legs": "Different number of legs");
  }
}
