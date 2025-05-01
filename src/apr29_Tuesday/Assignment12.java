package apr29_Tuesday;



import java.util.Scanner;

public class Assignment12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter base (x): ");
        double x = sc.nextDouble();

        System.out.print("Enter exponent (n): ");
        int n = sc.nextInt();

        double result = 1.0;

        // Copy of original exponent for printing purpose
        int originalN = n;

        // Handle negative exponent manually
        if (n < 0) {
            for (int i = 1; i <= -n; i++) {
                result *= x; //1*10 // 10*10 =100
            }
            result = 1.0 / result; //1.0/100 =
        } else {
            for (int i = 1; i <= n; i++) {
                result *= x;
            }
        }

        // Output
        System.out.printf("Result of %.5f raised to the power %d is: %.5f\n", x, originalN, result);

        sc.close();
    }
}

