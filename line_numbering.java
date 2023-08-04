import java.util.*;

public class line_numbering {
    public static List<String> number(List<String> lines) {
      int g = 1;
        
      for (int z = 0; z < lines.size(); z++) {
        lines.set(z, g + ": " + lines.get(z));
        g++;
      }
      
        return lines;
    }
}
