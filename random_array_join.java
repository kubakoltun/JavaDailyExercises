public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            int lpi = (int)(Math.random()*(5 +1)+0);
            int lpj = (int)(Math.random()*(5 +1)+0);
            while(lpi == lpj) {
                lpj = (int)(Math.random()*(5 +1)+0);
            }
            int lri = (int)(Math.random()*(4 +1)+0);
            int lpi1 = 0;
            int lpj1 = 0;
            int lri1 = 0;

            String[] abcs = {"a", "b", "c", "d", "e"};
            String[] nums = {"1", "2", "3", "4", "5", "6"};

            if (i != 0 && (lpi1 == lpi || lpj1 == lpj || lri1 == lri)) {
                while(lpi1 == lpi) {
                    lpi1 = (int)(Math.random()*(5 +1)+0);
                }
                while(lpj1 == lpj) {
                    lpj1 = (int)(Math.random()*(5 +1)+0);
                }
                while(lri1 == lri) {
                    lri1 = (int)(Math.random()*(5 +1)+0);
                }
            }
            System.out.println(nums[lpi] + abcs[lri] + nums[lpj]);
            lpi1 = lpi;
            lpj1 = lpj;
            lri1 = lri;
        }
    }
}
