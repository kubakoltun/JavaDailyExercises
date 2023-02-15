import java.util.Arrays;

public class DescendingOrder {
  public static int sortDesc(int num) {
    int length = 0;
    long temp = 1;
    while (temp <= num) {
        length++;
        temp *= 10;
    }
    int[] arr = new int[length];
    int i = 0;
    int sort = 0;
    while(num != 0) {
      int tmp = num % 10;
      num = num / 10;
      arr[i] = tmp;
      i++;
    }
    Arrays.sort(arr);
    int[] b = new int[arr.length];
        int j = arr.length;
        for (int k = 0; k < arr.length; k++) {
            b[j - 1] = arr[k];
            j = j - 1;
        }
    for (int g = 0; g < b.length; g++) {
      sort = 10*sort + b[g];
    }
    
    return sort;
  }
}
