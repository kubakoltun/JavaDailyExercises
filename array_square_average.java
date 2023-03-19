public class array_square_average {
  public static double solution(int[] arr1, int[] arr2) {
    int length = arr1.length;
    int difSum = 0;
    double avgHold = 0;
    for (int i = 0; i < length; i++) {
      difSum = 0;
      difSum = arr1[i] - arr2[i];
      difSum = difSum*difSum;
      avgHold += difSum;
    }
    
    return avgHold/length;
  }
}
