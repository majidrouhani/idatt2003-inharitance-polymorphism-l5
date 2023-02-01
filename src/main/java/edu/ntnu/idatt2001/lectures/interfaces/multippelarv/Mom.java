package edu.ntnu.idatt2001.lectures.interfaces.multippelarv;

interface Mom extends Grandfather, Grandmother {
  static final int alder = 42;

  static void talk(String melding) {
    System.out.println(melding + " ba meg si noe." + " Jeg er " + alder + " gammel. Hilsen fra mamma");

    Grandmother.talk("Mamma");
    Grandfather.talk("Mamma");
  }
}
