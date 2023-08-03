public class reversed_strings {
  public static String solution(String str) {
    String out = "";
      
    for (int i = str.length() - 1; i >= 0; i--) {
      out += str.charAt(i);
    }
    
    return out;
  }
}
