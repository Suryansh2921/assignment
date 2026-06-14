import java.util.Scanner;

 class DecimalToBinary {
     static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int num = sc.nextInt();

        String binary = "";

        while (num > 0) {
            int rem = num % 2;
            binary = rem + binary;
            num = num / 2;
        }

        System.out.println("Binary = " + binary);
    }
}