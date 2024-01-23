package edu.ntnu.idatt2003.lectures.anonymous;

import java.util.logging.Level;
import java.util.logging.Logger;

public class App {
  private static final Logger log = Logger.getLogger(App.class.getName());

  public void sayHello() {

    // Anonymous class
    HelloWorld frenchGreeting = new HelloWorld() {

      public void greet() {
        greetSomeone("tout le monde");
      }

      public void greetSomeone(String someone) {
        log.log(Level.INFO, "{0}", someone);
      }
    };

    // Anonymous class
    HelloWorld spanishGreeting = new HelloWorld() {
      String name = "mundo";

      public void greet() {
        greetSomeone("mundo");
      }

      public void greetSomeone(String someone) {
        name = someone;
        log.log(Level.INFO, "Hola, {0}", name);
      }
    };
    spanishGreeting.greet();
    frenchGreeting.greetSomeone("Fred");
  }

  public static void main(String... args) {
    App myApp = new App();
    myApp.sayHello();
  }
}
