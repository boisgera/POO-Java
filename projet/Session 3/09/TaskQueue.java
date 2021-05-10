import java.lang.Runnable;
import java.util.LinkedList;

class TaskQueue implements Runnable {
  private LinkedList<Runnable> queue;
  public TaskQueue() {
    queue = new LinkedList<Runnable>();
  }
  public void schedule(Runnable runnable) {
    queue.add(runnable);
  }
  public void run() {
    for (Runnable runnable: queue) {
      runnable.run();
    } 
  }
}