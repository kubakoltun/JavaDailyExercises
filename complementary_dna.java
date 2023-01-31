public class complementary_dna {
  public static String makeComplement(String dna) {
    char[] tab = dna.toCharArray();
    
    for (int i = 0; i < tab.length; i++) {
      tab[i] = getComplement(tab[i]);
    }
    
    return new String(tab);
    }
    
    private static char getComplement(char c) {
      switch (c){
        case 'A' : return 'T';
        case 'T' : return 'A';
        case 'C' : return 'G';
        case 'G' : return 'C';
          }
      return c;
  }
}
