package edu.ntnu.idatt2001.lectures.interfaces.figur;

import java.util.ArrayList;

public class App {

  public static void main(String[] args) {
    Painter p = new Painter();

    ArrayList<Paintable> paintableObjects = new ArrayList<>();

    paintableObjects.add(new Rectangle("Gr�nn"));
    paintableObjects.add(new Rectangle("R�d"));
    paintableObjects.add(new Circle("Bl�"));
    paintableObjects.add(new Circle("Gul"));
    paintableObjects.add(new Circle("Svart"));

    p.setPaintableObjects(paintableObjects);

    p.paintAllObjects();
  }
}
