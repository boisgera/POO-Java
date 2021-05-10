import java.io.PrintStream;

interface Debuggable {
  void setPrintStream(PrintStream stream);
  void setDebug(boolean debug);
}