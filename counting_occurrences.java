public class Counter {
  public int countSheeps(Boolean[] arrayOfSheeps) {
       
    int counter = 0;
    
    for (int i = 0; i < arrayOfSheeps.length; i++) {
      if (arrayOfSheeps[i] != null && arrayOfSheeps[i] == true) {
        counter++;
      }
    }
    return counter;
  }
}
