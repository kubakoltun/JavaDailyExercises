public class random_arrays {
    public static void main(String[] args) {
            int[] tab1 = new int[(int) (Math.random() * 10)];
            int[] tab2 = new int[(int) (Math.random() * 10)];
            int[] tab3 = new int[(int) (Math.random() * 10)];

            tab1 = res(tab1);
            tab2 = res(tab2);
            tab3 = res(tab3);

            int[] re = new int[tab1.length+tab2.length+tab3.length];
            int j1 = 0;
            int j2 = 0;
            int j3 = 0;

            for (int i = 0; i < re.length; i++) {
                if (j1 < tab1.length) {
                    re[i] = tab1[j1];
                    j1++;
                }
                else if (j2 < tab2.length) {
                    re[i] = tab2[j2];
                    j2++;
                }
                else if (j3 < tab3.length) {
                    re[i] = tab3[j3];
                    j3++;
                }
                System.out.println(re[i]);
            }
    }
  
    public static int[] res(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            tab[i] = (int) (Math.random() * 100);
            System.out.println("tworzenie " +tab[i]);
        }
        return tab;
    }
}
