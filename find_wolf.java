import java.util.*;

public class find_wolf {
  public static String warnTheSheep(String[] array) {
    Collections.reverse(Arrays.asList(array));
    int pos = Arrays.asList(array).indexOf("wolf");
    
    return pos == 0 ? "Pls go away and stop eating my sheep" : "Oi! Sheep number " + pos + "! You are about to be eaten by a wolf!";
  }
}
