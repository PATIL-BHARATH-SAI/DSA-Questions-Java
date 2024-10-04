import java.util.Scanner;

public class GCD_check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of A: ");
        int A = scanner.nextInt();
        System.out.print("Enter the value of B: ");
        int B = scanner.nextInt();
        int Temp, GCD=0;
        while(B != 0) {
            Temp = B;
            B = A % B;
            A = Temp;
        }
        GCD = A;
        System.out.println("\n GCD =  " + GCD);
    }
}