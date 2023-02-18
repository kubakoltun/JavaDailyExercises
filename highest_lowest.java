public class highest_lowest {
    public static String highAndLow(String numbers) {
        int mx = -99999;
        int mn = 99999;
        int sp = 0;
        int num = 0;
        for (int i = 0; i < numbers.length(); i++) {
          if (numbers.charAt(i) == ' ') {
            num = Integer.parseInt(numbers.substring(sp, i));
            sp = i + 1;
            if (mx < num) {
                mx = num;
            }
            if (mn > num) {
                mn = num;
            }
          }
        }
        num = Integer.parseInt(numbers.substring(sp));
        if (num < mn) {
            mn = num;
        }
        if (num > mx) {
            mx = num;
        }
      
        return mx + " " + mn;
    }
}
