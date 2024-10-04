import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.Math;

public class Armstrong_num_range {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for user input for the range
        System.out.print("Enter the value of A: ");
        int A = scanner.nextInt();
        System.out.print("Enter the value of B: ");
        int B = scanner.nextInt();

        // Get the list of Armstrong numbers in the range
        List<Integer> armstrongNumbers = findArmstrongNumbersInRange(A, B);

        // Print the result
        System.out.println("Armstrong numbers in the range [" + A + ", " + B + "]: " + armstrongNumbers);

        scanner.close();
    }

    // Method to find Armstrong numbers in a given range
    public static List<Integer> findArmstrongNumbersInRange(int A, int B) {
        List<Integer> armstrongNumbers = new ArrayList<>();
        for (int i = A; i <= B; i++) {
            if (isArmstrong(i)) {
                armstrongNumbers.add(i);
            }
        }
        return armstrongNumbers;
    }

    // Method to check if a number is Armstrong
    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;
        int digits = String.valueOf(number).length();

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number /= 10;
        }

        return sum == originalNumber;
    }
}