import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class enough_is_enough {
	public static int[] deleteNth(int[] elements, int maxOccurrences) {
    Map<Integer, Integer> tabOfNum = new HashMap<>();
    List<Integer> result = new ArrayList<>();
    
		for (int num : elements) {
      tabOfNum.put(num, tabOfNum.getOrDefault(num, 0) + 1);
      
      if (tabOfNum.get(num) <= maxOccurrences) {
        result.add(num);
      }
    }
    
    int[] resultArr = new int[result.size()];
    for (int i = 0; i < result.size(); i++) {
      resultArr[i] = result.get(i);
    }
    
		return resultArr;
	}
}
