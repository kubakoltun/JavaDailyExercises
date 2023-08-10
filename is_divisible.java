public class is_divisible {
    public static boolean isDivisible(int... numbers) { 
      int g = 0;
      for (int n : numbers) {
        if (g == 0) {
          g = n;
        }
        if (g % n != 0) {
          return false;
        } 
      }
        
      return true;
    }
}
