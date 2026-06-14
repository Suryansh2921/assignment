 class CharacterPyramid {
     static void main(String[] args) {
        int rows = 5;
        
        for (int i = 1; i <= rows; i++) {
            // Print leading spaces for centering
            for (int space = 1; space <= rows - i; space++) {
                System.out.print(" ");
            }
            
            // Print ascending characters: A to current char
            for (int j = 0; j < i; j++) {
                System.out.print((char)('A' + j));
            }
            
            // Print descending characters: one before current back to A
            for (int j = i - 2; j >= 0; j--) {
                System.out.print((char)('A' + j));
            }
            
            System.out.println();
        }
    }
}