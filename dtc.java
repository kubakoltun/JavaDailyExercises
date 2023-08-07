public class dtc {
  public static double toIndustrial(String time) {
    String[] timeC = time.split(":");
    int hour = Integer.parseInt(timeC[0]);
    int minutes = Integer.parseInt(timeC[1]);
    
    return Math.round((hour + (minutes / 60.0)) * 100.0) / 100.0;
  }
  
  public static double toIndustrial(int time) {
    return Math.round((time / 60.0) * 100.0) / 100.0;
  }
  
  public static String toNormal(double time) {
    int hours = (int) time;
    int minutes = (int) Math.round((time - hours) * 60); 
    
    if (minutes >= 60) {
        hours += minutes / 60;
        minutes %= 60;
    }
    
    return hours + ":" + String.format("%02d", minutes);
  }
}
