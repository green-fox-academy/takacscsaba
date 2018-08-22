package main.java.music;

public class BassGuitar extends StringedInstrument {
  public BassGuitar(int numberOfStrings) {
    numberOfStrings = 4;
    this.numberOfStrings = numberOfStrings;
    this.name = "Bass Guitar";
  }

  public BassGuitar() {
    numberOfStrings = 4;
    name = "Bass Guitar";
  }

  @Override
  public void sound() {
    System.out.println("Duum-duum-duum");
  }
}
