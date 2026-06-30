import java.util.Scanner;

public class TicketBookingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int seats[] = new int[5]; // 5 seats: 0=available, 1=booked
        int choice, seatNo;

        do {
            System.out.println("\n--- Ticket Booking System ---");
            System.out.println("1. View Seats");
            System.out.println("2. Book Ticket");
            System.out.println("3. Cancel Ticket");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Seat Status:");
                    for (int i = 0; i < seats.length; i++) {
                        if (seats[i] == 0)
                            System.out.println("Seat " + (i + 1) + ": Available");
                        else
                            System.out.println("Seat " + (i + 1) + ": Booked");
                    }
                    break;

                case 2:
                    System.out.print("Enter seat number (1-5): ");
                    seatNo = sc.nextInt();

                    if (seatNo >= 1 && seatNo <= 5) {
                        if (seats[seatNo - 1] == 0) {
                            seats[seatNo - 1] = 1;
                            System.out.println("Ticket Booked Successfully!");
                        } else {
                            System.out.println("Seat already booked!");
                        }
                    } else {
                        System.out.println("Invalid Seat Number!");
                    }
                    break;

                case 3:
                    System.out.print("Enter seat number to cancel (1-5): ");
                    seatNo = sc.nextInt();

                    if (seatNo >= 1 && seatNo <= 5) {
                        if (seats[seatNo - 1] == 1) {
                            seats[seatNo - 1] = 0;
                            System.out.println("Ticket Cancelled Successfully!");
                        } else {
                            System.out.println("Seat is not booked!");
                        }
                    } else {
                        System.out.println("Invalid Seat Number!");
                    }
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