public class Card {
  int value;
  String valueCode;
  String name;
  Character suit;

  public Card(String valueCode, Character suit) {
    this.valueCode = valueCode;
    this.suit = suit;
  }
}
