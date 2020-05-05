package xml;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

public class Element {
  public String tag;
  public Map<String, String> attrib; 
  public List<Element> children;
  public String text;
  public String tail;

// TODO : support varargs for Elements ?

  public Element(String tag, Element[] children, String[][] attrib, String text, String tail)
  {
    this.tag = tag; // Mmm null tag would be invalid.
    if (text == null) {
      text = "";
    }
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
    if (tail == null) {
      tail = "";
    }
    this.tail = tail;
  }
  public Element(String tag, Element[] children, String[][] attrib)
  {
    this(tag, children, attrib, null, null);
  }

  public Element(String tag, String[][] attrib, String text)
  {
    this(tag, null, attrib, text, null);
  }
  
  public Element(String tag, Element[] children)
  {
    this(tag, children, null, null, null);
  }
  
  public Element(String tag, String[][] attrib)
  {
    this(tag, null, attrib, null, null);
  }
  
  public Element(String tag, String text)
  {
    this(tag, null, null, text, null);
  }
  
  public Element(String tag) {
    this(tag, null, null, null, null);
  }

  public String toString() {
    String string;
    string = "<" + tag;
    for (Map.Entry<String, String> entry : attrib.entrySet()) { 
      string += " " + entry.getKey() + "=" + "\"" + XML.escape(entry.getValue()) + "\""; 
    }
    string += ">";
    string += XML.escape(text);
    for (Element elt : children) {
      string += elt.toString();
    }
    string += "</" + tag + ">";  
    if (tail != null) {
      string += XML.escape(tail);
    }
    return string;
  }

}