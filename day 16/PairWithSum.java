public class PairWithSum {
    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 11, 15};
        int sum = 18;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    System.out.println("Pair found: " + arr[i] + " + " + arr[j] + " = " + sum);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("No pair found");
        }
    }
}
