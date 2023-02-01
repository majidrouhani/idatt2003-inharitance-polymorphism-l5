package edu.ntnu.idatt2001.lectures.interfaces.multippelarv;

interface Dad extends Grandfather, Grandmother {
  static final int age = 45;

  static void talk(String message) {
    System.out.println(message + " ba meg si noe." + " Jeg er " + age + " gammel. Hilsen fra pappa");

    Grandmother.talk("Pappa");
    Grandfather.talk("Pappa");
  }
}