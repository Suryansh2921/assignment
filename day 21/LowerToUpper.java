import java.util.Scanner;

public class LowerToUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter lowercase string: ");
        String str = sc.nextLine();

        String upper = str.toUpperCase();

        System.out.println("Uppercase = " + upper);
    }
}
