package edu.ntnu.idatt2001.lectures.interfaces.samemethod.abstraction;

import java.util.ArrayList;

public class App {

  /**
   * @param args
   */
  public static void main(final String[] args) {
    final Car c = new Car();

    ArrayList<Passenger> passengers = new ArrayList<Passenger>();

    passengers.add(new Passenger("Smussforfatter Inco Gnito", "M"));
    passengers.add(new Passenger("Patolog Rigmor Mortis", "F"));
    passengers.add(new Passenger("Syngedame Nanna Na", "F"));
    passengers.add(new Passenger("Befal Gj�rde A. Sap", "M"));
    passengers.add(new Passenger("Tigergutt", "M", "Smussforfatter"));
    passengers.add(new Passenger("Pus", "F", "Naboen"));

    c.setPassengers(passengers);

    for (Passenger passenger : passengers) {
      System.out.println(passenger);
    }
  }

}
