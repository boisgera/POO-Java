import java.lang.System;
import java.lang.Runnable;

class PrintAction implements Runnable {
  String message;
  public PrintAction(String message) {
    this.message = message;
  }
  public void print() {
    System.out.println(message);
  }
  public void run() {
    print();
  }
}