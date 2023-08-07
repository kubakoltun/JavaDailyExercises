public class dtc {
  public static double toIndustrial(String time) {
    double hour = time.valueOf(time.charAt(0));
    double minuteF = time.valueOf(time.charAt(2));
    double minuteS = time.valueOf(time.charAt(3));
    
    double result = hour+(minuteF*10+minuteS)/60.0;
    return result;
  }
  
  public static double toIndustrial(int time) {
    return time/60.0;
  }
  
  public static String toNormal(double time) {
    
    return ;
  }
