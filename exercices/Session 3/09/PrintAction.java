import java.lang.System;

class PrintAction {
  String message;
  public PrintAction(String message) {
    this.message = message;
  }
  public void print() {
    System.out.println(message);
  }
}