public class disemvowel {
    public static String disemvowel(String str) {
      String nstr = "";
        for (int i = 0; i < str.length(); i++) {
          if (str.charAt(i) == 'a'|| str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || 
             str.charAt(i) == 'u' ||
             str.charAt(i) == 'A'|| str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || 
             str.charAt(i) == 'U' ) {
            System.out.println("log");
          }
          else {
            nstr += str.charAt(i);
          }
        }
      
      return nstr;
    }
}
