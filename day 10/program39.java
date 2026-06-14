class NumberPyramid {
     static void main(String[] args) {
        int rows = 5;
        
        for (int i = 1; i <= rows; i++) {
            // Print leading spaces for centering
            for (int space = 1; space <= rows - i; space++) {
                System.out.print(" ");
            }
            
            // Print ascending numbers: 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            
            // Print descending numbers: i-1 down to 1
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            
            System.out.println();
        }
    }
}
