import java.lang.System;
import java.io.PrintStream;

class Point implements Debuggable {
  private double x;
  private double y;
  private PrintStream out = System.out;
  private boolean debug = false;

  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }
  public double getX() {
    if (debug) {
        out.println("getX() --> " + x);
    }
    return this.x;
  }
  public double getY() {
    if (debug) {
        out.println("getY() --> " + y);
    }
    return this.y;
  }
  public void setPrintStream(PrintStream out) {
    this.out = out;
  }
  public void setDebug(boolean debug) {
    this.debug = debug;
  }
}
