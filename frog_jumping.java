public class frog_jumping {
    public static int solution(int[] a) {      
      int jumps = 0;
      int val = 0;
      int i = 0;
      do {
        if (i < 0) {
          break;
        }
        val = a[i];
        if (a[0] < 0) {
          jumps++;
          break;
        }
        i += val;
        
        jumps++;
        if (jumps > 20) {
          jumps = -1;
          break;
        }
        System.out.print(" i=" + i + " dlugosc=" + a.length + " ");
      }
      while(i < a.length || i < 0);
      
      return jumps;
    }
}
