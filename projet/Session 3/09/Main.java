class Main {
  public static void main(String[] args) {
    PrintAction p1 = new PrintAction("Message 1");
    PrintAction p2 = new PrintAction("Message 2");
    PrintAction p3 = new PrintAction("Message 3");

    TaskQueue queue = new TaskQueue();
    queue.schedule(p1);
    queue.schedule(p2);
    queue.schedule(p3);
    queue.run();
  }
}