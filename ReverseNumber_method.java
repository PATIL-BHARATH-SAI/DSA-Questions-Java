import java.util.Scanner;

public class ReverseNumber_method {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Reverse the number
        int reversedNumber = reverseDigits(number);

        // Output the reversed number
        System.out.println("Reversed number: " + reversedNumber);

        scanner.close();
    }

    private static int reverseDigits(int num) {
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10; // Get the last digit
            reversed = reversed * 10 + digit; // Append it to the reversed number
            num /= 10; // Remove the last digit from the original number
        }

        return reversed;
    }
}
