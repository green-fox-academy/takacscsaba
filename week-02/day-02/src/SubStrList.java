import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SubStrList {
  public static void main(String[] args) {
    String[] searchArr = new String[]{"this", "is", "what", "I'm", "searching"};
    System.out.println(subStrList("ching", Arrays.asList(searchArr)));
  }

  public static Integer subStrList(String string, List list) {
    for (int i = 0; i < string.length(); i++) {
      for (int j = 0; j < list.size(); j++) {
        if (list.contains(string)) {
          return list.indexOf(string);
        } else {
          return -1;
        }
      }
    }
    return -1;
  }
}
//  Create a function that takes a string and a list of string as a parameter
//  Returns the index of the string in the list where the first string is part of
//  Only need to find the first occurence and return the index of that
//  Returns `-1` if the string is not part any of the strings in the list

//  Example
//  String[] searchArr = new String[] {"this", "is", "what", "I'm", "searching"};
//    System.out.println(subStrList("ching", searchArr));
//  should print: `4`
//        System.out.println(subStrList("not", searchArr));
//  should print: `-1`