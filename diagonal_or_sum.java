public class diagonal_or_sum {
    public static void main(String[] args) {
        int[][] array1 = {{1, 1, 3}, {1, 1, 3}, {1, 1, 3}};
        int[][] array2 = {{2, 2, 2}, {2, 2, 2}};
        int[][] array3 = {{1, 2, 3}, {1, 2, 3}};

        int[] result1 = metoda(array1);
        int[] result2 = metoda(array2);
        int[] result3 = metoda(array3);

        System.out.println("Result 1:");
        printArray(result1);

        System.out.println("Result 2:");
        printArray(result2);

        System.out.println("Result 3:");
        printArray(result3);
    }

    private static void printArray(int[] result) {
        for (int i = 0; i < result.length; i++) {
            System.out.println(i+"-"+result[i]);
        }
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
