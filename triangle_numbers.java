public class TriangleNumbers {
    public static Boolean isTriangleNumber(long number) {
        if (number < 0) {
            return false;
        }
        double n = (-1 + Math.sqrt(1 + 8 * number)) / 2;

        return n == (int) n && number == n * (n + 1) / 2;
    }
}
