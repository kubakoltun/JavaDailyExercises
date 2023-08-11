public class filter_string {
    public static long filterString(final String value) {
      StringBuilder inBetween = new StringBuilder();
        
      for (int i = 0; i < value.length(); i++) {
        if (Character.isDigit(value.charAt(i))) {
          inBetween.append(value.charAt(i));
        }
      }
        
      return Long.parseLong(inBetween.toString());
    }
}
