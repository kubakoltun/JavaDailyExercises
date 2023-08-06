public class string_increment {
  public static String incrementString(String str) {
    String number = "";
    String restOfS = "";
    int numCon = 0;
    
    for (int i = 0; i < str.length(); i++) {
      if (Character.isDigit(str.charAt(i))) {
          number += str.charAt(i);
       } 
    }
    
    if (number.equals("")) {
      number = "1";
      return str + number;
    }
    numCon = Integer.parseInt(number);
    numCon++;
    String subS = str.substring(0, str.length() -  number.length()+1);
    
    if (Character.isDigit(subS.charAt(subS.length() - 1))) {
      return str.substring(0, str.length() -  String.valueOf(numCon).length()) + numCon;
    } else {
      return str.substring(0, str.length() -  String.valueOf(numCon).length()+1) + numCon;
    }
  }
}
