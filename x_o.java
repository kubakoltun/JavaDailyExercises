public class x_o {
  
  public static boolean getXO (String str) {
    
    int x = 0;
    int o = 0;
    
    for (int i = 0; i < str.length(); i++) {
      if (str.toUpperCase().charAt(i) == 'X')
        x++;
      if (str.toUpperCase().charAt(i) == 'O')
        o++;
    }
    
    return x == o;
    
  }
}
