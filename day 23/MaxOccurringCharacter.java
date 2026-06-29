import java.util.Scanner;

public class MaxOccurringCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int[] count = new int[256];

        // Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }

        int max = 0;
        char maxChar = ' ';

        // Find maximum occurring character
        for (int i = 0; i < str.length(); i++) {
            if (count[str.charAt(i)] > max) {
                max = count[str.charAt(i)];
                maxChar = str.charAt(i);
            }
        }

        System.out.println("Maximum occurring character: " + maxChar);
        System.out.println("Frequency: " + max);
    }
}