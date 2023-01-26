class FirstNonConsecutive {
    static Integer find(final int[] array) { 
     Integer b = 0;
     
      for (int i = 0; i < array.length - 1; i++) {
        if (array[i] + 1 != array[i + 1]) {
          b = array[i + 1];
          break;
          
        } else {
          b = null;
        }     
       }
      return b;
    }
}
