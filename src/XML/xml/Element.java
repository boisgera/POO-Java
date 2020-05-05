package xml;
//import java.util.List;
import java.util.HashMap;

// TODO: here everything is generic and changeable at runtime.
//       Which means that we cannot have say a fixed "Group" Element.

class Element {
  public String tag;
  public HashMap<String, String> attrib; 
  public Element[] children;
  public String text;
  public String tail;

// TODO : constructors

  public String toString() {
    String str;
    str = "<" + tag + ">"; // TODO: insert attrib here.
    if (text != null) {
      str.concat(text);
    }
    for (Element elt : children) {
      str.concat(elt.toString());
    }
    if (tail != null) {
      str.concat(tail);
    }
    return str;
  }

}