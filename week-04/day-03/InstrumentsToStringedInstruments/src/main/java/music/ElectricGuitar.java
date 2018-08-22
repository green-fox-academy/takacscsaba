package main.java.music;

public class ElectricGuitar extends StringedInstrument {
  public ElectricGuitar(int numberOfStrings) {
    this.numberOfStrings = numberOfStrings;
    this.name = "Electric Guitar";
  }

  public ElectricGuitar() {
    numberOfStrings = 6;
    name = "Electric Guitar";
  }

  @Override
  public void sound() {
    System.out.println(name + ", a " + numberOfStrings + "-stringed instrument that goes Twang");
  }
}
