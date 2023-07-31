public class maskify {
    public static String maskify(String str) {
      String resPart = "";
      String maskPart = "";
      int len = 0;
      
      if (str.length() < 4) {
        if (str.length() == 3) {
          resPart = str.substring(str.length()-3);
          len = str.length()-3;
        }
        else if (str.length() == 2) {
          resPart = str.substring(str.length()-2);
          len = str.length()-2;
        }
        else if (str.length() == 1) {
          resPart = str.substring(str.length()-1);
          len = str.length()-1;
        } else {
          return "";
        }
      } else {
         resPart = str.substring(str.length()-4);
         len = str.length()-4;
      }
       
      for (int i = 0; i < len; i++) {
        maskPart += "#";
      }
      
      return maskPart+resPart;
    }
}
