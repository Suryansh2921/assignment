import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "";
        int choice;

        do {
            System.out.println("\n--- String Operation System ---");
            System.out.println("1. Enter String");
            System.out.println("2. Find Length");
            System.out.println("3. Convert to Uppercase");
            System.out.println("4. Reverse String");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter String: ");
                    str = sc.nextLine();
                    break;

                case 2:
                    System.out.println("Length = " + str.length());
                    break;

                case 3:
                    System.out.println("Uppercase = " + str.toUpperCase());
                    break;

                case 4:
                    String rev = "";
                    for (int i = str.length() - 1; i >= 0; i--) {
                        rev += str.charAt(i);
                    }
                    System.out.println("Reversed String = " + rev);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }
        } while (choice != 5);

        sc.close();
    }
}
