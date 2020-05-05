package xml;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

// TODO: here everything is generic and changeable at runtime.
//       Which means that we cannot have say a fixed "Group" Element.

class Element {
  public String tag;
  public Map<String, String> attrib; 
  public List<Element> children;
  public String text;
  public String tail;

  // TODO : constructors. With tag only, etc.

  public Element(String tag, Element[] children, String[][] attrib, String text, String tail)
  {
    this.tag = tag;
    this.text = text;
    this.children = new ArrayList<Element>();
    if (children == null) {
      children = new Element[0];
    }
    for (Element child: children) {
      this.children.add(child);
    }
    this.attrib = new HashMap<String, String>();
    if (attrib == null) {
      attrib = new String[0][2];
    }
    for (String[] kv : attrib) {
      String key = kv[0];
      String value = kv[1];
      this.attrib.put(key, value);
    }
    this.tail = tail;
  }

  public Element(String tag) {
    // Element[] children = {};
    // String[][] attrib = {};
    // this(tag, null, children, attrib, null);
    this(tag, null, null, null, null);

  }

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