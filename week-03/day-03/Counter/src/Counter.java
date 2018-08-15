public class Counter {
  int number;
  int field = 0;

  public Counter() {
    field = 0;
  }

  public Counter(int number) {
    this.number = number;
  }


  public int add(int number) {
    field += number;
    return field;
  }

  public int add() {
    field++;
    return field;
  }

  public int get() {
    field += number;
    return field;
  }

  public int reset() {
    field = 0;
    return field;
  }
}
//  Create Counter class
//    which has an integer field value
//    when creating it should have a default value 0 or we can specify it when creating
//    we can add(number) to this counter another whole number
//    or we can add() without parameters just increasing the counter's value by one
//    and we can get() the current value
//    also we can reset() the value to the initial value