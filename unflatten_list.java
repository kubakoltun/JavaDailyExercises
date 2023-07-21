import java.util.ArrayList;
import java.util.List;

public class Kata {
    public static Object[] unflatten(int[] arr) {
        List<Object> result = new ArrayList<>();
        int i = 0;

        while (i < arr.length) {
            int subArraySize = arr[i];
            if (subArraySize > 2) {
                List<Integer> subArray = new ArrayList<>();
                for (int j = 1; j <= subArraySize && i + j < arr.length; j++) {
                    subArray.add(arr[i + j]);
                }
                result.add(subArray);
                i += subArraySize + 1;
            } else {
                result.add(arr[i]);
                i++;
            }
        }

        return result.toArray();
    }
}
