import java.util.*;

class Contact {
    String name;
    String phone;

    Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
}

public class ContactManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Contact> contacts = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n--- Contact Management System ---");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Phone Number: ");
                    String phone = sc.nextLine();
                    contacts.add(new Contact(name, phone));
                    System.out.println("Contact Added!");
                    break;

                case 2:
                    if (contacts.isEmpty()) {
                        System.out.println("No contacts found.");
                    } else {
                        for (Contact c : contacts) {
                            System.out.println("Name: " + c.name + ", Phone: " + c.phone);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Name to Search: ");
                    String search = sc.nextLine();
                    boolean found = false;
                    for (Contact c : contacts) {
                        if (c.name.equalsIgnoreCase(search)) {
                            System.out.println("Found -> Name: " + c.name + ", Phone: " + c.phone);
                            found = true;
                        }
                    }
                    if (!found)
                        System.out.println("Contact not found.");
                    break;

                case 4:
                    System.out.print("Enter Name to Delete: ");
                    String del = sc.nextLine();
                    boolean removed = contacts.removeIf(c -> c.name.equalsIgnoreCase(del));
                    if (removed)
                        System.out.println("Contact Deleted!");
                    else
                        System.out.println("Contact not found.");
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
