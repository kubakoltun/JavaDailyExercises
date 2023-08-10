public class is_divisible {
    public static boolean isDivisible(int firstNum, int... divs) { 
      for (int n : divs) {
        if (firstNum % n != 0) {
          return false;
        } 
      }
        
      return true;
    }
}
