package edu.ntnu.idatt2001.lectures.interfaces.samemethod;

import java.util.ArrayList;
import java.util.List;

public class Car {

  List<Passenger> passengers = new ArrayList<>();

  public List<Passenger> getPassengers() {
    return passengers;
  }

  public void setPassengers(List<Passenger> passengers) {
    this.passengers = passengers;
  }
}
