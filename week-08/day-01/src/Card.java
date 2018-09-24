import java.util.HashMap;
import java.util.Map;

public class Card implements Comparable<Card>{
  int value;
  String valueCode;
  Character suit;

  private Map<String, Integer> valueCodeToValue;

  public Card() {
    valueCodeToValue = new HashMap<>();
    for (int i = 2; i < 11; i++) {
      valueCodeToValue.put(String.valueOf(i), i);
    }
    valueCodeToValue.put("J", 11);
    valueCodeToValue.put("Q", 12);
    valueCodeToValue.put("K", 13);
    valueCodeToValue.put("A", 14);
  }

  public Card(String valueCode, Character suit) {
    this();
    this.valueCode = valueCode;
    this.suit = suit;
    this.value = valueCodeToValue.get(valueCode);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (!(o instanceof Card)) {
      return false;
    }
    Card card = (Card) o;
    return card.hashCode() == hashCode();
  }

  @Override
  public int hashCode() {
    return suit.hashCode() * 100 + this.valueCode.hashCode();
  }

  @Override
  public int compareTo(Card other) {
    return this.value - other.value;
  }
}
