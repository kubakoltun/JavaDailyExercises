import java.math.BigInteger;

public class string_increment {
  public static String incrementString(String str) {
    String number = "";
    String restOfS = "";
    int numLength = 0;
    
    for (int i = 0; i < str.length(); i++) {
      if (Character.isDigit(str.charAt(i))) {
          number += str.charAt(i);
          numLength++;
       } else {
          number = "";
          numLength = 0;
      }
    }
    
    if (numLength == 0) {
      return str + "1";
    }
    
    BigInteger numCon = new BigInteger(number).add(BigInteger.ONE);

    String formattedNumber = String.format("%0" + numLength + "d", numCon);
    String result = str.substring(0, str.length() - numLength) + formattedNumber;

    return result;
  }
}
