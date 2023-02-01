package edu.ntnu.idatt2001.lectures.interfaces.figur;

import java.util.ArrayList;
import java.util.List;

public class Painter {
  private List<Paintable> paintableObjects;

  public Painter() {
    paintableObjects = new ArrayList<>();
  }

  public List<Paintable> getPaintableObjects() {
    return paintableObjects;
  }

  public void setPaintableObjects(List<Paintable> paintableObjects) {
    this.paintableObjects = paintableObjects;
  }

  public void paintAllObjects() {
    for (Paintable paintable : paintableObjects) {
      paintable.paint();
    }
  }
}