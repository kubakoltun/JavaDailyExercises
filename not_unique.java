class not_unique {
    public static int solve(int [] arr) {
      int con = 0;
      for (int i = 0; i < arr.length; i++) {
        if (con != Math.abs(arr[i])) {
          con = arr[i];
        }
      }
      
      return con;
    }
}
