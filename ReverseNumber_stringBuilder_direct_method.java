package Reverse_Number;
import java.util.Scanner;

public class ReverseNumber_stringBuilder_direct_method {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Reverse the number using StringBuilder
        String reversedString = new StringBuilder(String.valueOf(number)).reverse().toString();
        int reversedNumber = Integer.parseInt(reversedString);

        // Output the reversed number
        System.out.println("Reversed number: " + reversedNumber);

        scanner.close();
    }
}
