public class reversed_array_of_digits {
  public static int[] digitize(long n) {
      String tmep = Long.toString(n);
      int[] arr = new int[tmep.length()];
      int tlr = tmep.length()-1;
      for (int i = 0; i < tmep.length(); i++) {
        arr[i] = tmep.charAt(tlr) - '0';
        tlr--;
      }
    
      return arr;
  }
}
