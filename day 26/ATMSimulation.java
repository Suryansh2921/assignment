import java.util.Scanner;

public class ATMSimulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balance = 1000; // initial balance
        int choice;
        int amount;

        System.out.println("🏧 Welcome to ATM Machine");

        while (true) {
            System.out.println("\nChoose option:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("💰 Your Balance: " + balance);
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    amount = sc.nextInt();

                    if (amount > 0) {
                        balance += amount;
                        System.out.println("✅ Successfully deposited.");
                    } else {
                        System.out.println("⚠️ Invalid amount.");
                    }
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    amount = sc.nextInt();

                    if (amount > 0 && amount <= balance) {
                        balance -= amount;
                        System.out.println("✅ Please collect your cash.");
                    } else {
                        System.out.println("❌ Insufficient balance or invalid amount.");
                    }
                    break;

                case 4:
                    System.out.println("🙏 Thank you for using ATM. Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("❌ Invalid choice. Try again.");
            }
        }
    }
}