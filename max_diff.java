public class max_diff {
  public static int maxDiff(int[] lst) {
    if (lst.length < 1) {
      return 0;
    } 
    
    int max = lst[0];
    int min = lst[0];
    
    for (int i = 0; i < lst.length; i++) {
      if (lst[i] > max) {
        max = lst[i];
      }
      if (lst[i] < min) {
        min = lst[i];
      }
    }
  
    return max - min;
  }
}
