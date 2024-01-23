package edu.ntnu.idatt2003.lectures.local;

import java.util.logging.Level;
import java.util.logging.Logger;

public class App {
  private static final Logger log = Logger.getLogger(App.class.getName());

  public void sayHello() {

    // Local class
    class EnglishGreeting extends HelloWorld {

      public void greet() {
        greetSomeone("world");
      }

      public void greetSomeone(String someone) {
        log.log(Level.INFO, "{0}", someone);
      }
    }

    HelloWorld englishGreeting = new EnglishGreeting();

    englishGreeting.greet();
    englishGreeting.greetSomeone("Fred");
  }

  public static void main(String... args) {
    App myApp = new App();
    myApp.sayHello();
  }
}
