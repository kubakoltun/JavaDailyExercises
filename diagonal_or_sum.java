public class diagonal_or_sum {
    public static void main(String[] args) {
        System.out.println(metoda(new int[][]{{1, 1, 3}, {1, 1, 3}, {1, 1, 3}}));
        System.out.println(metoda(new int[][]{{2, 2, 2}, {2, 2, 2}}));
        System.out.println(metoda(new int[][]{{1, 2, 3}, {1, 2, 3}}));
    }

    public static int[] metoda(int[][] slowo) {
        int sum = 0;
        int[] tab;

        for (int i = 0; i < slowo.length; i++) {
            for (int j = 0; j < slowo[i].length; j++) {
                sum += slowo[i][j];
            }
        }

        if (sum % 2 != 0) {
            tab = new int[slowo.length];
            int g = 0;

            for (int i = 0; i < slowo.length; i++) {
                for (int j = i; j <= i; j++) {
                    tab[g] = slowo[i][j];
                    g++;
                }
            }
        } else {
            tab = new int[1];
            int sumCol = 0;

            for (int i = 0; i < slowo.length; i++) {
                for (int j = slowo.length/2; j <= slowo.length/2; j++) {
                    sumCol += slowo[i][j];
                }
            }
            tab[0] = sumCol;
        }

        return tab;
    }
}
