public class visible_dots_on_die {
  public int totalAmountVisible(int topNum, int numOfSides) {    
    int[] opSide = new int[numOfSides];
    int res = 0;
    
    for (int i = 0; i < numOfSides; i++) {
      opSide[i] = numOfSides-i;
      res += numOfSides-i;
    }
    
    return res-opSide[topNum-1];
  }
}
