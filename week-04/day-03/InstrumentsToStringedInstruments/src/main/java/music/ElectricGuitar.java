package main.java.music;

public class ElectricGuitar extends StringedInstrument {
  public ElectricGuitar(int numberOfStrings) {
    numberOfStrings = 6;
    this.numberOfStrings = numberOfStrings;
    this.name = "Electric Guitar";
  }

  public ElectricGuitar() {
    numberOfStrings = 6;
    name = "Electric Guitar";
  }

  @Override
  public void sound() {
    System.out.println("Twang");
  }
}
