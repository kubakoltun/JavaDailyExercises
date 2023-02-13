public class smallest_integer {
    public static int findSmallestInt(int[] args) {
      int tmp = args[0];
      for (int i = 0; i < args.length; i++) {
        if (args[i] < tmp) {
          tmp = args[i];
        }
      }
      
      return tmp;
    }
}
