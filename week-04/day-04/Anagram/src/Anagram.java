import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Anagram {
  public boolean anagram(String string1, String string2) {

    List<Character> chars1 = new ArrayList<>();
    List<Character> chars2 = new ArrayList<>();

    for (char ch : string1.toCharArray()) {
      chars1.add(ch);
    }
    for (char ch : string2.toCharArray()) {
      chars2.add(ch);
    }

    Collections.sort(chars1);
    Collections.sort(chars2);
    return chars1.equals(chars2);

  }
}