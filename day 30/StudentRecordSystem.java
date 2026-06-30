
import java.util.Scanner;

public class StudentRecordSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String names[] = new String[5];
        int marks[] = new int[5];
        int count = 0;
        int choice;

        do {
            System.out.println("\n--- Student Record System ---");
            System.out.println("1. Add Student Record");
            System.out.println("2. Display Records");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    if (count < 5) {
                        System.out.print("Enter Student Name: ");
                        names[count] = sc.nextLine();

                        System.out.print("Enter Marks: ");
                        marks[count] = sc.nextInt();

                        count++;
                        System.out.println("Record Added!");
                    } else {
                        System.out.println("Record Full!");
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No records found.");
                    } else {
                        System.out.println("Student Records:");
                        for (int i = 0; i < count; i++) {
                            System.out.println("Name: " + names[i] + 
                                               ", Marks: " + marks[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Name to Search: ");
                    String search = sc.nextLine();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (names[i].equalsIgnoreCase(search)) {
                            System.out.println("Found -> Name: " + names[i] +
                                               ", Marks: " + marks[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Student not found.");
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }
        } while (choice != 4);

        sc.close();
    }
}