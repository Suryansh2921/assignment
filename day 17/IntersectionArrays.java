import java.util.HashSet;

public class IntersectionArrays {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4};
        int arr2[] = {3, 4, 5, 6};

        HashSet<Integer> set = new HashSet<>();

        // Add first array elements
        for (int num : arr1) {
            set.add(num);
        }

        System.out.println("Intersection of arrays:");

        // Check common elements
        for (int num : arr2) {
            if (set.contains(num)) {
                System.out.print(num + " ");
            }
        }
    }
}