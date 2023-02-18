public class square_digit {
  public int squareDigits(int n) {
    String str = Integer.toString(n);
    String nstr = "";
    for (int i = 0; i < str.length(); i++) {
      int nn = Character.getNumericValue(str.charAt(i));  
      nn *= nn;
      nstr += Integer.toString(nn);
    }
    int nnn = Integer.parseInt(nstr);  
    
    return nnn;
  }
}
