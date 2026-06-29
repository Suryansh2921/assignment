import java.util.Scanner;

public class FirstRepeatingChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.next();

        boolean found = false;

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    System.out.println("First repeating character: " + str.charAt(i));
                    found = true;
                    return;
                }
            }
        }

        if (!found) {
            System.out.println("No repeating character found.");
        }
    }
}
