public class FindDivisor {

  public long numberOfDivisors(int n) {
    
    int counter = 0;
    
    int x = 1;
    
    for (int i = 0; i < n; i++) {
      
      if (n % x == 0) {
        counter++;
        x += 1;
      } else {
        x += 1;
      }
    
    
    }
    
    return counter;

  }

}
