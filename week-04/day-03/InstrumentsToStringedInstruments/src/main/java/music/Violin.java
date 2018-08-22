package main.java.music;

public class Violin extends StringedInstrument {
  public Violin() {
    numberOfStrings = 4;
    name = "Violin";
  }

  @Override
  public void sound() {
    System.out.println("Screech");
  }
}
