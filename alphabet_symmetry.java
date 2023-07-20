public class alphabet_symmetry {
    public static int[] solve(String[] arr) {      
      int[] res = new int[arr.length];
      char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
      int sum = 0;
      
      for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length(); j++) {
          if (j > 25) {
            break;
          } else {
            if (Character.toLowerCase(arr[i].charAt(j)) == alphabet[j]) {
              sum++;
            }
          }
        }
        res[i] = sum;
        sum = 0;
      }
      
      return res;
    }
}
