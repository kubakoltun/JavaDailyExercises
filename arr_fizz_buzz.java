public class arr_fizz_buzz {
    public static int[] solution(int number) {
      int sumA = 0;
      int sumB = 0;
      int sumC = 0;
      
      for (int i = 1; i < number; i++) {
        if (i % 3 == 0 && i % 5 != 0) {
          sumA++;
        }
        if (i % 5 == 0 && i % 3 != 0) {
          sumB++;
        }
        if (i % 15 == 0) {
          sumC++;
        }
      }
      
      int[] res = {sumA, sumB, sumC};
      return res;
    }
}
