import java.util.Scanner;

public class LargestPrimeFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int largest = 1;

        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                boolean prime = true;

                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        prime = false;
                        break;
                    }
                }

                if (prime) {
                    largest = i;
                }
            }
        }

        System.out.println("Largest Prime Factor = " + largest);
    }
}