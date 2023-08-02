public class sum_of_positive {
  public static int sum(int[] arr) {
    int x = 0;
    
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > 0) {
        x += arr[i];
      }
    }
    
    return x;
  }
}
