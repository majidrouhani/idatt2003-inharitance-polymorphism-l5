package edu.ntnu.idatt2001.lectures.interfaces.multippelarv;

interface Grandmother {
  static final int age = 64;

  static void talk(String message) {
    System.out.println(message + " ba meg si noe." + " Jeg er " + age + " gammel. Hilsen fra bestemor");
  }
}
