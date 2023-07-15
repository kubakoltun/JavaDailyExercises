import java.util.Arrays;
import java.util.Comparator;

public class name_comparator {
  public static String[] lineupStudents(String students) { 
    String[] res = students.split(" ");
    
    Arrays.sort(res, new Comparator<String>() {
            @Override
            public int compare(String name1, String name2) {
                if (name1.length() == name2.length()) {
                    return name2.compareTo(name1); 
                }
                return Integer.compare(name2.length(), name1.length()); 
            }
        });
    
    return res;
  }
}
