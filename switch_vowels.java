public class Kata {
  public static String vowel2Index(String s) {
    char[] vowels =  {'a', 'e', 'i', 'o', 'u'};
    String result = "";
    
    for (int i = 0; i < s.length(); i++) {
      if (includes(s.charAt(i), vowels)) {
        result += i+1;
      } else {
        result += s.charAt(i);
      }
    }
    
    return result;
  }
  
  public static boolean includes(char ct, char[] vow) {
    for (char c : vow) {
      if (c == ct) {
        return true;
      }
    }
    
    return false;
  }
}
