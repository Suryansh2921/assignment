public class MaxFrequency {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 2, 5, 2, 3, 3, 3};

        int maxCount = 0;
        int maxElement = arr[0];

        for (int i = 0; i < arr.length; i++) {
            int count = 1;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                maxElement = arr[i];
            }
        }

        System.out.println("Maximum Frequency Element: " + maxElement);
        System.out.println("Frequency: " + maxCount);
    }
}