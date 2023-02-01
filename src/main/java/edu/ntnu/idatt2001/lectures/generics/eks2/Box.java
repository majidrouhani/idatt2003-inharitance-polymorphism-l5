package edu.ntnu.idatt2001.lectures.generics.eks2;

import java.util.ArrayList;
import java.util.List;

/**
 * Generic version of the Box class.
 * 
 * @param <T> the type of the value being boxed
 */
public class Box<T> {
  private List<T> t = new ArrayList<>();

  public void set(T t) {
    this.t.add(t);
  }

  public List<T> get() {
    return this.t;
  }
}