package edu.ntnu.idatt2001.lectures.anonymous;

import java.util.logging.Level;
import java.util.logging.Logger;

public class App {
  private static final Logger log = Logger.getLogger(App.class.getName());

  public void sayHello() {

    // Local class
    class EnglishGreeting extends HelloWorld {
      String name = "world";

      public void greet() {
        greetSomeone("world");
      }

      public void greetSomeone(String someone) {
        name = someone;
        log.log(Level.INFO, "{0}", name);
      }
    }

    HelloWorld englishGreeting = new EnglishGreeting();

    // Anonymous class
    HelloWorld frenchGreeting = new HelloWorld() {
      String name = "tout le monde";

      public void greet() {
        greetSomeone("tout le monde");
      }

      public void greetSomeone(String someone) {
        name = someone;
        log.log(Level.INFO, "{0}", name);
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
    englishGreeting.greet();
    frenchGreeting.greetSomeone("Fred");
    spanishGreeting.greet();
  }

  public static void main(String... args) {
    App myApp = new App();
    myApp.sayHello();
  }
}
