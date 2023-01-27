public class ZywOo {
  public static int sumOfDifferences(int[] arr) {
    
    int temp = 0;
    
    int result = 0;
    
    for (int j = 0; j < arr.length; j++) {
      for (int k = j + 1; k < arr.length; k++)  {
        
        if (arr[j] < arr[k]) {
          temp = arr[j];
          arr[j] = arr[k];
          arr[k] = temp;
        }
}
    }
    
    
    for (int i = 0; i < arr.length - 1; i++) {
      
      if (arr.length > 1) {
                
            result = result + (arr[i] - arr[i + 1]);
          
      } else {
        result = 0;
      }
      
    }
    return result;
  }
}
