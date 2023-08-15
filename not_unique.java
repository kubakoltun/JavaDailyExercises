import java.util.HashSet;

public class not_unique {
    public static int solve(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        
        for (int num : arr) {
            if (set.contains(-num)) {
                set.remove(-num);
            } else {
                set.add(num);
            }
        }
        
        return set.iterator().next();
    }
  }
