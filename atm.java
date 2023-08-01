public class atm {
  public int solve(int n) {
  		if (n % 10 != 0) {
        return -1;
      }
    
      int cash = n;
      int bills = 0;
    
      while (cash > 0) {
        if (cash >= 500) {
          cash -= 500;
          bills++;
        }
        else if (cash >= 200) {
          cash -= 200;
          bills++;
        }
        else if (cash >= 100) {
          cash -= 100;
          bills++;
        }
        else if (cash >= 50) {
          cash -= 50;
          bills++;
        }
        else if (cash >= 20) {
          cash -= 20;
          bills++;
        }
        else if (cash >= 10) {
          cash -= 10;
          bills++;
        }
      }
    
   return bills; 
  }
}
