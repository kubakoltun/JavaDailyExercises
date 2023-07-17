public class points_amount {
    public static int points(String[] games) {
      int sum = 0;
      
      for (String game : games) {
        char x = game.charAt(0),
             y = game.charAt(2);
        
        sum += (x > y ? 3 : x == y ? 1 : 0); 
      }
      
      return sum;
    }
}
