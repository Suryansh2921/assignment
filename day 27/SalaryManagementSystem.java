import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    int id;
    String name;
    double basicSalary;
    double hra;
    double da;
    double grossSalary;

    Employee(int id, String name, double basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
        calculateSalary();
    }

    // Salary calculation
    void calculateSalary() {
        hra = 0.20 * basicSalary;  // 20% HRA
        da = 0.10 * basicSalary;   // 10% DA
        grossSalary = basicSalary + hra + da;
    }

    void display() {
        System.out.println("\n🧾 Employee Salary Details");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA (20%): " + hra);
        System.out.println("DA (10%): " + da);
        System.out.println("Gross Salary: " + grossSalary);
    }
}

public class SalaryManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> list = new ArrayList<>();

        int choice;

        System.out.println("💰 Welcome to Salary Management System");

        while (true) {
            System.out.println("\n1. Add Employee Salary");
            System.out.println("2. View All Salaries");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Basic Salary: ");
                    double salary = sc.nextDouble();

                    list.add(new Employee(id, name, salary));
                    System.out.println("✅ Employee salary added!");
                    break;

                case 2:
                    System.out.println("\n📋 Salary Records:");
                    if (list.isEmpty()) {
                        System.out.println("No records found.");
                    } else {
                        for (Employee e : list) {
                            e.display();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Employee ID: ");
                    int searchId = sc.nextInt();
                    boolean found = false;

                    for (Employee e : list) {
                        if (e.id == searchId) {
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