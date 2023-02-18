class alternate_capitalization {
    public static String[] capitalize(String s) {
      String strE = "";
      String strO = "";
      String[] strR = new String[2];
      for (int i = 0; i < s.length(); i++) {
        if (i % 2 == 0 && s.charAt(i) != ' ') {
          strE += Character.toUpperCase(s.charAt(i));
        } else {
          strE += s.charAt(i);
        }
        if (i % 2 != 0 && s.charAt(i) != ' ') {
          strO += Character.toUpperCase(s.charAt(i));
        } else {
          strO += s.charAt(i);
        }
      }
      strR[0] = strE;
      strR[1] = strO;
      
      return strR;
    }
}
