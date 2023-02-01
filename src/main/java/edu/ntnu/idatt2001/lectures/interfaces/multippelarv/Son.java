package edu.ntnu.idatt2001.lectures.interfaces.multippelarv;

class Son implements Mom, Dad {
  static final int alder = 15;

  public void talk(String melding) {
    System.out.println(melding + " ba meg si noe." + " Jeg er " + alder + " gammel. Hilsen fra barnebarn!");

    Mom.talk("Barn");
    Dad.talk("Barn");
  }
}