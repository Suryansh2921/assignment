import java.util.*;

class Product {
    int id;
    String name;
    int quantity;

    Product(int id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }
}

public class InventoryManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n--- Inventory Management System ---");
            System.out.println("1. Add Product");
            System.out.println("2. View Products");
            System.out.println("3. Update Quantity");
            System.out.println("4. Search Product");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Product ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Product Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();
                    products.add(new Product(id, name, qty));
                    System.out.println("Product Added!");
                    break;

                case 2:
                    if (products.isEmpty()) {
                        System.out.println("No products available.");
                    } else {
                        for (Product p : products) {
                            System.out.println("ID: " + p.id +
                                    ", Name: " + p.name +
                                    ", Quantity: " + p.quantity);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Product ID to update: ");
                    int updateId = sc.nextInt();
                    boolean found = false;

                    for (Product p : products) {
                        if (p.id == updateId) {
                            System.out.print("Enter New Quantity: ");
                            p.quantity = sc.nextInt();
                            System.out.println("Quantity Updated!");
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Product not found.");
                    break;

                case 4:
                    System.out.print("Enter Product Name to search: ");
                    sc.nextLine();
                    String search = sc.nextLine();
                    boolean searchFound = false;

                    for (Product p : products) {
                        if (p.name.equalsIgnoreCase(search)) {
                            System.out.println("Found -> ID: " + p.id +
                                    ", Name: " + p.name +
                                    ", Quantity: " + p.quantity);
                            searchFound = true;
                        }
                    }

                    if (!searchFound)
                        System.out.println("Product not found.");
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