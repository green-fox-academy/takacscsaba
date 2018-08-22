package main.java.music;

public abstract class StringedInstrument extends Instrument {
  int numberOfStrings;

  public abstract void sound();

  public void play() {
    sound();
  }
}
