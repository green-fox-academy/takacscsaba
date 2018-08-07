public class TodoPrint {
  public static void main(String... args) {
    String todoText = " - Buy milk\n";

    StringBuffer todoList = new StringBuffer(todoText);
    String missingBeginning = "My todo:\n";
    String missingEnd = " - Download games\n";
    String missingDiablo = "\t - Diablo\n";
/*
    todoList.insert(0, missingBeginning);
    todoList.insert(21, missingEnd);
    todoList.insert(39, missingDiablo);*/

    System.out.println(todoList.insert(0, missingBeginning).
        append(missingEnd).append(missingDiablo));
  }
}