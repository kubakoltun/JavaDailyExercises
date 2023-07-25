public class bigger_char_group {
    public static String battle(final String x, final String y) {
      int sumX = 0;
      int sumY = 0;
      String result = "";
      
      for (int i = 0; i < x.length(); i++) {
        sumX += (int) x.charAt(i) - 64;
      }
      for (int i = 0; i < y.length(); i++) {
        sumY += (int) y.charAt(i) - 64;
      }
      
      if (sumX > sumY) {
        result = x;
      } 
      else if (sumY > sumX) {
        result = y;
      } else {
        result = "Tie!";
      }
      
      return result;
    }
}
