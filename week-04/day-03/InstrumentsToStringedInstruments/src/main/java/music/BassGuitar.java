package main.java.music;

public class BassGuitar extends StringedInstrument {
  public BassGuitar(int numberOfStrings) {
    this.numberOfStrings = numberOfStrings;
    this.name = "Bass Guitar";
  }

  public BassGuitar() {
    numberOfStrings = 4;
    name = "Bass Guitar";
  }

  @Override
  public void sound() {
    System.out.println(name + ", a " + numberOfStrings + "-stringed instrument that goes Duum-duum-duum");
  }
}
