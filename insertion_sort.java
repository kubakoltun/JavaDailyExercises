public void sort(int[] arr) {
  for (int i = 1; i < arr.length; i++) {
      int num = arr[i];
      int j = i;
      while (j > 0 && arr[j - 1] > num) {
          arr[j] = arr[j - 1];
          j--;
      }
      arr[j] = num;
  }
}
