public class counting_duplicates {
  public static int duplicateCount(String text) {
    int duplicates = 0;
    char[] duplicatesTab = new char[text.length()];
    int g = 0;
    
    for (int i = 0; i < text.length(); i++) {
      for (int j = 0; j < text.length(); j++) {
        if (Character.toLowerCase(text.charAt(i)) == Character.toLowerCase(text.charAt(j))) {
          if (!contains(Character.toLowerCase(text.charAt(i)), duplicatesTab)) {
            duplicates++;
            duplicatesTab[g] = Character.toLowerCase(text.charAt(i));
            g++;
          }
        }
      }
    }
    
    return duplicates;
  }
  
  public static boolean contains(char c, char[] tab) {
    for (char tabC : tab) {
      if (tabC == c) {
        return true;
      }
    }

    return false;
  }
}

