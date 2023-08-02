public class replace_every_nth {
  public static String replaceNth(String text, int n, char oldValue, char newValue) {
    int nOld = 0;
    StringBuilder newStr = new StringBuilder(text);
    
    for (int i = 0; i < newStr.length(); i++) {
      if (newStr.charAt(i) == oldValue) {
        nOld++;
        if (nOld == n) {
          newStr.setCharAt(i, newValue);
          nOld = 0;
        }
      }
    }
    
    return newStr.toString();
  }
}
