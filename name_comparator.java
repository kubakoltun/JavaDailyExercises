import java.util.Arrays;
import java.util.Comparator;

public class name_comparator {
  public static String[] lineupStudents(String students) { 
    String[] res = students.split(" ");
    String[] lst = new String[res.length];
    
    Arrays.sort(res, Comparator.comparingInt(String::length).reversed());
    
    return res;
  }
}
