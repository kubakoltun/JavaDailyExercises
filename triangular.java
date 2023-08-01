public class triangular {
    public static long triangular(long n) {
      if (n <= 0) {
        return 0;
      }
      
      long sum = 0;
      for (long i = n; i > 0; i--) {
        sum += i;
      }
      
      return sum;
    }
}
