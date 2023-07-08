public class will_square_run_to_one {
    public static boolean isHappyNumber(int number) {
        int slow = number;
        int fast = number;

        do {
            slow = calculateSquareSum(slow);
            fast = calculateSquareSum(calculateSquareSum(fast));
        } while (slow != fast);

        return slow == 1;
    }

    private static int calculateSquareSum(int number) {
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum += digit * digit;
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int number = 19;
        boolean isHappy = isHappyNumber(number);
        System.out.println(number + " is happy? " + isHappy);
    }
}
