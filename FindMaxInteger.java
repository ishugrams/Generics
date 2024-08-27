import java.util.Scanner;

public class FindMaxInteger {

    public static Integer findMax(Integer num1, Integer num2, Integer num3) {
        Integer max = num1;

        if (num2 > max) {
            max = num2;
        }

        if (num3 > max) {
            max = num3;
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Test Case 1.1: Enter numbers with the max number at the 1st position.");
        System.out.print("Enter the first integer (max number): ");
        Integer num1 = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        Integer num2 = scanner.nextInt();
        System.out.print("Enter the third integer: ");
        Integer num3 = scanner.nextInt();
        System.out.println("The maximum number is: " + findMax(num1, num2, num3)); // Expected output: num1

        System.out.println("\nTest Case 1.2: Enter numbers with the max number at the 2nd position.");
        System.out.print("Enter the first integer: ");
        num1 = scanner.nextInt();
        System.out.print("Enter the second integer (max number): ");
        num2 = scanner.nextInt();
        System.out.print("Enter the third integer: ");
        num3 = scanner.nextInt();
        System.out.println("The maximum number is: " + findMax(num1, num2, num3)); // Expected output: num2

        System.out.println("\nTest Case 1.3: Enter numbers with the max number at the 3rd position.");
        System.out.print("Enter the first integer: ");
        num1 = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        num2 = scanner.nextInt();
        System.out.print("Enter the third integer (max number): ");
        num3 = scanner.nextInt();
        System.out.println("The maximum number is: " + findMax(num1, num2, num3)); // Expected output: num3

    }
}
