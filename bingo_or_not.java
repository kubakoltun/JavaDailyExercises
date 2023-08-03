public class BingoOrNot {
    public static String bingo(int[] numberArray) {
      String result = ""; 
      int b = 0;
      int i = 0;
      int n = 0;
      int g = 0;
      int o = 0;
      
      for (int z = 0; z < numberArray.length; z++) {
        if (numberArray[z] == 2) {
          b++;
        }
        if (numberArray[z] == 7) {
          g++;
        }
        if (numberArray[z] == 9) {
          i++;
        }
        if (numberArray[z] == 14) {
          n++;
        }
        if (numberArray[z] == 15) {
          o++;
        }
      } 
      
      if (b > 0 && g > 0 && i > 0 && n > 0 && o > 0) {
        result = "WIN";
      } else {
        result = "LOSE";
      }
      
      return result;
    }
}
