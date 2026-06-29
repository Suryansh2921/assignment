                                                                                                                                                                                import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    int[] marks = new int[5];
    int total;
    double percentage;
    String result;

    void calculate() {
        total = 0;
        for (int mark : marks) {
            total += mark;
        }

        percentage = total / 5.0;

        // Result logic
        boolean fail = false;
        for (int mark : marks) {
            if (mark < 35) {
                fail = true;
                break;
            }
        }

        if (fail) {
            result = "FAIL";
        } else {
            result = "PASS";
        }
    }

    void display() {
        System.out.println("\n📄 ----- MARKSHEET -----");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }

        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Result: " + result);
    }
}

public class MarksheetSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s = new Student();

        System.out.print("Enter Roll No: ");
        s.rollNo = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Name: ");
        s.name = sc.nextLine();

        System.out.println("Enter marks of 5 subjects:");

        for (int i = 0; i < 5; i++) {
            s.marks[i] = sc.nextInt();
        }

        s.calculate();
        s.display();

        sc.close();
    }
}