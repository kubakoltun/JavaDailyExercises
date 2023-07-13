public class control_growth {
  public static int grow(int[] x){
    int y = 1;

    for (int i = 0; i < x.length; i++) {
      y *= x[i];
    }
    
    return y;
  }
}
