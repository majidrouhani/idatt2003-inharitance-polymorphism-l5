package edu.ntnu.idatt2003.lectures.generics.eks2;

import java.util.ArrayList;
import java.util.List;

import edu.ntnu.idatt2003.lectures.generics.eks1.IsoscelesTriangle;
import edu.ntnu.idatt2003.lectures.generics.eks1.Triangle;

public class App {

  public static void main(String[] args) {

    List<Object> store = new ArrayList<>();

    Box<String> strBox = new Box<>();
    strBox.set("Things");
    strBox.set("Another thing");
    store.add(strBox);

    Box<Integer> intBox = new Box<>();
    intBox.set(76);
    store.add(intBox);

    Box<Triangle> triangleBox = new Box<>();
    triangleBox.set(new IsoscelesTriangle(10, 15));
    store.add(triangleBox);


    for (Object object: store) {
        System.out.println(object);
    }
  }  
}
