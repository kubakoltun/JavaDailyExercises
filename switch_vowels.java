public class switch_vowels {
  public static String vowel2Index(String s) {
    char[] vowels =  {'a', 'e', 'i', 'o', 'u'};
    String result = "";
    
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i).includes(vowels)) {
        result += i+1;
      } else {
        result += s.charAt(i);
      }
    }
    return result;
  }
}
