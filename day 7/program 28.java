import java.util.Scanner;

public class RecursiveReverse {
    
    static void reverse(int n) {
        if (n < 10) {
            System.out.print(n);
            return;
        }

        System.out.print(n % 10);
        reverse(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.print("Reversed Number = ");
        reverse(num);
    }
}