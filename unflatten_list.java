import java.util.ArrayList;

public class unflatten_list {
  public static Object[] unflatten(int[] flatArray) { 
    ArrayList<Object> res = new ArrayList<>();
    
    
    for (int i = 0; i < flatArray.length; i++) {
      
        if (flatArray[i] >= 3) {
          int innerLoop = Math.min(flatArray[i], flatArray.length-i);
          int[] tmp = new int[innerLoop];
          for (int j = 0; j < innerLoop; j++) {
            tmp[j] = flatArray[i + j];
          }
          res.add(tmp);
        } else {
          res.add(flatArray[i]);
        }  
    }
    
    return res.toArray();
  }
}
