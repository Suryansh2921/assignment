import java.util.Scanner;

public class StudentManagementProject {
    static String names[] = new String[10];
    static int marks[] = new int[10];
    static int count = 0;
    static Scanner sc = new Scanner(System.in);

    static void addStudent() {
        if (count < 10) {
            System.out.print("Enter Student Name: ");
            names[count] = sc.nextLine();

            System.out.print("Enter Marks: ");
            marks[count] = sc.nextInt();
            sc.nextLine();

            count++;
            System.out.println("Student Added!");
        } else {
            System.out.println("Record Full!");
        }
    }

    static void viewStudents() {
        if (count == 0) {
            System.out.println("No records found.");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". Name: " + names[i] +
                               ", Marks: " + marks[i]);
        }
    }

    static void searchStudent() {
        System.out.print("Enter Name to Search: ");
        String search = sc.nextLine();

        for (int i = 0; i < count; i++) {
            if (names[i].equalsIgnoreCase(search)) {
                System.out.println("Found -> Name: " + names[i] +
                                   ", Marks: " + marks[i]);
                return;
            }
        }
        System.out.println("Student not found.");
    }

    static void updateMarks() {
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        for (int i = 0; i < count; i++) {
            if (names[i].equalsIgnoreCase(name)) {
                System.out.print("Enter New Marks: ");
                marks[i] = sc.nextInt();
                sc.nextLine();
                System.out.println("Marks Updated!");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    static void deleteStudent() {
        System.out.print("Enter Student Name to Delete: ");
        String name = sc.nextLine();

        for (int i = 0; i < count; i++) {
            if (names[i].equalsIgnoreCase(name)) {
                for (int j = i; j < count - 1; j++) {
                    names[j] = names[j + 1];
                    marks[j] = marks[j + 1];
                }
                count--;
                System.out.println("Student Deleted!");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Marks");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: addStudent(); break;
                case 2: viewStudents(); break;
                case 3: searchStudent(); break;
                case 4: updateMarks(); break;
                case 5: deleteStudent(); break;
                case 6: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid Choice!");
            }
        } while (choice != 6);

        sc.close();
    }
}