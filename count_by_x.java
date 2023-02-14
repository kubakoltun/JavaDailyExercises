public class count_by_x {
  public static int[] countBy(int x, int n){
    int[] tab = new int[n];
    int tmp = x;
    for (int i = 0; i < n; i++) {
      tab[i] =  tmp;
      tmp += x;
    }
    
    return tab;
  }
}
