public class NthSeries {
	public static String seriesSum(int n) {
    double sum = 0;
    int xn = 0;
    double a = 0;
		for (int i = 0; i < n; i++) {
      a += 1.0/(1+xn);
      xn += 3;
      sum = (double) Math.round(a * 100) / 100;
      System.out.println(sum);
    }
    
    return sum+"";
  }
}
