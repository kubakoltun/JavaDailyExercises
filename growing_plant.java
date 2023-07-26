public class growing_plant {
    public static int growingPlant(int upSpeed, int downSpeed, int desiredHeight) {
        int growth = 0;
        int growthDays = 0;
      
        while (growth < desiredHeight) {
          growth += upSpeed;
          growthDays++;
          if (growth >= desiredHeight) {
            break;
          }
          growth -= downSpeed;
        }
      
        return growthDays;
    }
}
