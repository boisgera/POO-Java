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
    assert tag != null;
    this.tag = tag;
    this.text = text;
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
    return this.toString(0, tab, null);
  }

  private String toString(int depth, String tab, boolean[] mayIndentNext) {
    if (mayIndentNext == null) {
      mayIndentNext = new boolean[1];
      mayIndentNext[0] = true;
    }
    String string = "";
    if (tab != null && mayIndentNext[0]) {
        string += tab.repeat(depth);
    } 
    string += "<" + tag;
    for (Map.Entry<String, String> entry : attrib.entrySet()) { 
      string += " " + entry.getKey() + "=" + "\"" + XML.escape(entry.getValue()) + "\""; 
    }
    string += ">";
    if (text == null) {
      if (tab != null) {
          string += "\n";
      }
      mayIndentNext[0] = true;
    } else {
      string += XML.escape(text);
      mayIndentNext[0] = false;
    }
    for (Element elt : children) { // should not indent the first if text != ""
      string += elt.toString(depth+1, tab, mayIndentNext);
    }
    if (tab != null && mayIndentNext[0]) {
      string += tab.repeat(depth);
  } 
    string += "</" + tag + ">";  
    if (tail == null) {
      if (tab != null) {
        string += "\n";
      }
      mayIndentNext[0] = true;
    } else {
      string += XML.escape(tail); 
      mayIndentNext[0] = false;
    }
    return string;
  }




}