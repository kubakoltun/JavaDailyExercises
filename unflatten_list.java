import java.util.ArrayList;
import java.util.List;

public class Kata {
    public static Object[] unflatten(int[] arr) {
      
        
        List<Object> result = new ArrayList<>();
        int i = 0;

        while (i < arr.length) {
            if (arr[i] < 3) {
                result.add(arr[i]);
                i++;
            } else {
                int subArraySize = arr[i];
                Object[] subArray = new Object[subArraySize];

                for (int j = 0; j < subArraySize && i + j + 1 < arr.length; j++) {
                    subArray[j] = arr[i + j + 1];
                }

                result.add(subArray);
                i += subArraySize + 1;
            }
        }

        return result.toArray();
    }
  }
