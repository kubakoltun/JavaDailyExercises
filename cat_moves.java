public class cat_moves {
  public static int solution(int start, int finish) {
    int moves = 0;
    boolean hasJumped = false;
    
    for (int i = start; i < finish; i++) {
      hasJumped = false;
      if (start+3%2==0 && start+3 <= finish) {
        start += 3;
        moves += 1;
      }
      else if (start+3%2!=0 && start+3 <= finish) {
        start += 3;
        moves += 1;
      } else {
        start += 1;
        moves += 1;
      }
      
      if (start == finish) {
        break;
      }
    }
    
    return moves;
  }
}
