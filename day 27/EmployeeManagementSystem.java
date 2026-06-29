import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> empList = new ArrayList<>();

        int choice;

        System.out.println("🧑‍💼 Welcome to Employee Management System");

        while (true) {
            System.out.println("\n1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();

                    sc.nextLine(); // clear buffer

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();

                    empList.add(new Employee(id, name, salary));
                    System.out.println("✅ Employee added successfully!");
                    break;

                case 2:
                    System.out.println("\n📋 Employee List:");
                    if (empList.isEmpty()) {
                        System.out.println("No employees found.");
                    } else {
                        for (Employee e : empList) {
                            e.display();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Employee ID to search: ");
                    int searchId = sc.nextInt();
                    boolean found = false;

                    for (Employee e : empList) {
                        if (e.id == searchId) {
                            System.out.println("🔍 Employee Found:");
                            e.display();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("❌ Employee not found.");
                    }
                    break;

                case 4:
                    System.out.println("👋 Exiting system...");
                    sc.close();
                    return;

                default:
                    System.out.println("❌ Invalid choice!");
            }
        }
    }
}