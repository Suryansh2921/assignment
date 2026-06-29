import java.util.Scanner;

class Student {
    int id;
    String name;
    int age;
    String course;

    void display() {
        System.out.println("\n🎓 Student Record");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}

public class StudentRecord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s = new Student();

        System.out.print("Enter Student ID: ");
        s.id = sc.nextInt();

        sc.nextLine(); // consume newline

        System.out.print("Enter Name: ");
        s.name = sc.nextLine();

        System.out.print("Enter Age: ");
        s.age = sc.nextInt();

        sc.nextLine(); // consume newline

        System.out.print("Enter Course: ");
        s.course = sc.nextLine();

        s.display();

        sc.close();
    }
}