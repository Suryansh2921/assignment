import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r1, c1, r2, c2;

        System.out.print("Enter rows and columns of first matrix: ");
        r1 = sc.nextInt();
        c1 = sc.nextInt();

        System.out.print("Enter rows and columns of second matrix: ");
        r2 = sc.nextInt();
        c2 = sc.nextInt();

        // Condition for multiplication
        if (c1 != r2) {
            System.out.println("Matrix multiplication not possible!");
            return;
        }

        int a[][] = new int[r1][c1];
        int b[][] = new int[r2][c2];
        int result[][] = new int[r1][c2];

        System.out.println("Enter first matrix elements:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter second matrix elements:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        // Matrix multiplication
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        System.out.println("Result Matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}