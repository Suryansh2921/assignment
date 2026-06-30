import java.util.Scanner;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String names[] = new String[5];
        double salary[] = new double[5];
        int count = 0;
        int choice;

        do {
            System.out.println("\n--- Employee Management System ---");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Salary");
            System.out.println("5. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    if (count < 5) {
                        System.out.print("Enter Employee Name: ");
                        names[count] = sc.nextLine();

                        System.out.print("Enter Salary: ");
                        salary[count] = sc.nextDouble();

                        count++;
                        System.out.println("Employee Added!");
                    } else {
                        System.out.println("Record Full!");
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No employees found.");
                    } else {
                        for (int i = 0; i < count; i++) {
                            System.out.println("Name: " + names[i] +
                                               ", Salary: " + salary[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Employee Name to Search: ");
                    String search = sc.nextLine();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (names[i].equalsIgnoreCase(search)) {
                            System.out.println("Found -> Name: " + names[i] +
                                               ", Salary: " + salary[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Employee not found.");
                    break;

                case 4:
                    System.out.print("Enter Employee Name: ");
                    String emp = sc.nextLine();
                    boolean updated = false;

                    for (int i = 0; i < count; i++) {
                        if (names[i].equalsIgnoreCase(emp)) {
                            System.out.print("Enter New Salary: ");
                            salary[i] = sc.nextDouble();
                            System.out.println("Salary Updated!");
                            updated = true;
                            break;
                        }
                    }

                    if (!updated)
                        System.out.println("Employee not found.");
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
