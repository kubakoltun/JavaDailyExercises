import java.util.HashMap;
import java.util.Map;

public class count_to_map {
    public static Map<Character, Integer> count(String str) {
      Map<Character, Integer> con = new HashMap<>();
      
      for (int i = 0; i < str.length(); i++) {
        if (!(con.containsValue(str.charAt(i)))) {
          int countR = 0;
          for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j) == str.charAt(i)) {
              countR++;
            }
          }
          con.put(str.charAt(i), countR);
        }
      }      
      
      return con;
    }
}
