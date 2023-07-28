public class phone_number {
  public static String createPhoneNumber(int[] numbers) {
    String number = "(";
    
    for (int i = 0; i < numbers.length; i++) {
      number += numbers[i];
      if (i == 2) {
        number += ") ";
      }
      if (i == 5) {
        number += "-";
      }
    }
    
    return number;
  }
}
