public class two_positive {
  public static boolean twoArePositive(int a, int b, int c) {
    boolean result = false;
    int resCheck = 0;
    
    resCheck += criteria(a);
    resCheck += criteria(b);
    resCheck += criteria(c);
    
    if (resCheck == 2) {
      result = true;
    } 
    
    return result;
  }
  
  public static int criteria(int x) {
    int checkIfC = 0;
    
    if (x > 0) {
      checkIfC++;
    }
    
    return checkIfC;
  }
}
