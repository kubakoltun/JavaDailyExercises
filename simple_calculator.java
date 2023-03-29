import java.util.Scanner;

public class simple_calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double first;
        double second;
        double result = 0;

            System.out.println("Enter first number:");
            first = scanner.nextDouble();
            System.out.println("Enter second number:");
            second = scanner.nextDouble();

            System.out.println("To execute addition type: +");
            System.out.println("To execute subtraction type: -");
            System.out.println("To execute multiplication type: *");
            System.out.println("To execute division type: /");

            char sign = scanner.next().charAt(0);

            switch (sign) {
                case '+' -> result = first + second;
                case '-' -> result = first - second;
                case '*' -> result = first * second;
                case '/' -> result = first / second;
            }


            System.out.println("Your result is: " + result);
    }
}
