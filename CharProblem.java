public class CharProblem {
  public static int howOld(final String herOld) {
    char age = ' ';
    for (int i = 0; i < herOld.length(); i++){
      if (i == 0) {
        System.out.print(herOld.charAt(i));
        age = herOld.charAt(i);
      }
    }
    int x = Character.getNumericValue(age);
    return x;
  
  }
}
