class XML {
/*
TODO: wrap "root" Element.

has a toString method ;

static helper methods : escape (a single one)

*/

  static String escape(String string) {
    string = string.replace("&", "&amp;");
    string = string.replace("\"", "&quot;");
    string = string.replace("'", "&apos;");
    string = string.replace("<", "&lt;");
    string = string.replace(">", "&gt;");
    return string;
  }
}