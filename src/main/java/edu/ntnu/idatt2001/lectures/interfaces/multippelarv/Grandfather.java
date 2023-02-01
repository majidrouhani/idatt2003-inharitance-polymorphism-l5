package edu.ntnu.idatt2001.lectures.interfaces.multippelarv;

interface Grandfather {
  static final int age = 67;

  static void talk(String message) {
    System.out.println(message + " ba meg si noe." + " Jeg er " + age + " gammel. Hilsen fra bestefar");
  }
}
