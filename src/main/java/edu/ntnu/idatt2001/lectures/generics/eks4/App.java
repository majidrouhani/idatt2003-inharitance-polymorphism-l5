package edu.ntnu.idatt2001.lectures.generics.eks4;

import java.util.logging.Level;
import java.util.logging.Logger;

public class App {

  private static final Logger log = Logger.getLogger(App.class.getName());

  public static void main(String args[]) {

    MyGeneric<Integer> factorial = new MyGeneric<Integer>() {
      @Override
      public Integer doIt(Integer n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
          result = i * result;
        }
        return result;
      }
    };

    MyGeneric<String> reverse = new MyGeneric<String>() {
      @Override
      public String doIt(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
          result += str.charAt(i);
        }
        return result;
      }
    };

    log.log(Level.INFO, "{0}", factorial.doIt(5));
    log.log(Level.INFO, "{0}", reverse.doIt("This is printed in reverse order!"));
  }
}
