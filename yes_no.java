public class yes_no {
    private static int count = 1;

    public static void yesNoCrt(int[] dataArr, int digits, int index) {

        if (index == digits) {
            String str = "";
            for (int i = 0; i < digits; i++) {
                if (dataArr[i] % 2 == 0) {
                    str = str + "yes, ";
                }
                else {
                    str = str + "no, ";
                }

            }
            System.out.println(str + " " + count);
            count++;

            return;
        }

        for (int i = 0; i < 2; i++) {
            dataArr[index] = i;
            yesNoCrt(dataArr, digits, index + 1);
        }
    }

    public static void main(String[] args) {

        int[] ynTabHold = new int[4];
        yesNoCrt(ynTabHold, 4, 0);
    }
}
