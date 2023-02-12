public class alternating_case {
  public static String toAlternativeString(String string) {
    String news = "";
    for (int i = 0; i < string.length(); i++) {
      if (Character.isUpperCase(string.charAt(i))) {
        news += Character.toLowerCase(string.charAt(i));
      } 
      else {
        news += Character.toUpperCase(string.charAt(i));

      }
    }
    
    return news;
  }
}
