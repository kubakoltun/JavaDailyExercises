public class Main {
    public static void main(String[] args) {
            int[] tab1 = new int[5];
            int[] tab2 = new int[7];

            for (int i = 0; i < tab1.length; i++) {
                tab1[i] = (int) (Math.random() * 10);
            }
            for (int i = 0; i < tab2.length; i++) {
                tab2[i] = (int) (Math.random() * 10);
            }

            arr(tab1, tab2, 1);
    }

    static int[] arr(int[] tab1, int[] tab2, int wrt) {
        int[] result;
        int len = tab1.length > tab2.length ? tab2.length : tab1.length; //Math.min(tab1.length, tab2.length);

        if (tab1.length == tab2.length) {
            result = new int[0];
        }
        else if (wrt < 0) {
            result = new int[len];
            for (int i = 0; i < len; i++) {
                result[i] = tab1[i] + tab2[i];
            }
        }
        else if (wrt > 0) {
            int difOfLen = tab1.length - tab2.length < 0 ? (tab1.length - tab2.length)*-1 : tab1.length - tab2.length; //Math.abs(tab1.length - tab2.length)
            result = new int[difOfLen];
            int g = 0;

            for (int i = len; i < len+difOfLen; i++) {
                result[g] = tab1.length > tab2.length ? tab1[i] : tab2[i];
                g++;
            }
        } else {
            result = new int[0];
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println("result "+result[i]);
        }

        return result;
    }
}
