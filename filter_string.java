public class filter_string {
    public static long filterString(final String value) {
      String inBetween = "";
      for (int i = 0; i < value.length(); i++) {
        if (value.charAt(i) == "$%d") {
          inBetween += value.charAt(i);
        }
      }
      
      return Integer.parseInt(inBetween);
    }
}
