public class Card {
  int value;
  String valueCode;
  String name;
  Character suit;

  public Card(String valueCode, Character suit) {
    this.valueCode = valueCode;
    this.suit = suit;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (!(o instanceof Card)) {
      return false;
    }
    Card card = (Card)o;
    return card.hashCode() == hashCode();
  }

  @Override
  public int hashCode() {
    return suit.hashCode() * 100 + this.valueCode.hashCode();
  }
}
