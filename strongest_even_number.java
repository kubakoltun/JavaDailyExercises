public class strongest_even_number {
   public static int strongestEven(int n, int m) {
    int strongestEvenNumber = n % 2 == 0 ? n : n + 1;

    int low = n;
    int high = m;

    while (low <= high) {
      int mid = (low + high) / 2;

      int strength = 0;
      int number = mid;
      while (number % 2 == 0) {
        strength++;
        number /= 2;
      }

      if (strength > strongestEvenNumber) {
        strongestEvenNumber = mid;
        low = mid + 1;
      } else if (strength < strongestEvenNumber) {
        high = mid - 1;
      } else {
        high = mid - 1;
      }
    }

    return strongestEvenNumber;
  }
}
