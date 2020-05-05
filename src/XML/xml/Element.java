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

// TODO : differentiate "" text and tail and null text and tail (i.e. not set,
// i.e. I don't care what the content is as long as it's whitespace).
// That would be smart, indeed.

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
    return this.toString(null);
  }

  public String toString(String tab) {
    return this.toString(0, tab);
  }

  private String toString(int depth, String tab) {
    String string = "";
    if (tab != null) {
        string += tab.repeat(depth);
    } 
    string += "<" + tag;
    for (Map.Entry<String, String> entry : attrib.entrySet()) { 
      string += " " + entry.getKey() + "=" + "\"" + XML.escape(entry.getValue()) + "\""; 
    }
    string += ">";
    if (text.equals("") && tab != null) {
      string += "\n";
    } else {
      string += XML.escape(text);
    }
    for (Element elt : children) { // should not indent the first if text != ""
      string += elt.toString(depth+1, tab);
    }
    string += "</" + tag + ">";  
    if (tail.equals("") && tab != null) {
        string += "\n";
    } else {
      string += XML.escape(tail); // Arf and the extra indent are an issue too.
      // we would need an extra flag in the toString method to handle that.
    }
    return string;
  }




}