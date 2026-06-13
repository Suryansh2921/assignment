import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Method 1: Using loop
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + num + " = " + fact);

        // Method 2: Using recursion
        System.out.println("Factorial (recursion) of " + num + " = " + factorial(num));

        sc.close();
    }

    // Recursive method
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}




