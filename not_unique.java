import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

class not_unique {
    public static int solve(int[] arr) {
        Set<Integer> encountered = new HashSet<>();
      
        for (int num : arr) {
            int absNum = Math.abs(num);
            if (encountered.contains(absNum)) {
                encountered.remove(absNum);
            } else {
                encountered.add(num);
            }
        }
      
        Iterator<Integer> iterator = encountered.iterator();
        return iterator.next();
    }
}
