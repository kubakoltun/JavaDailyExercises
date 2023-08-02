public class Dinglemouse {
  public static String whatTimeIsIt(final double angle) {
    int hour = 0;
    
    if (angle < 30) {
      hour = 12;
    } else {
      hour = (int) (angle/30);
    }

    int minutes = (int) ((angle % 30) * 2);
    String result = String.format("%02d:%02d", hour, minutes);
    
    return result;
  }
}
