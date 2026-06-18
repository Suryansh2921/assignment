                                                                                                                        import java.util.HashSet;

public class UnionOfArrays {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4};
        int arr2[] = {3, 4, 5, 6};

        HashSet<Integer> union = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {
            union.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            union.add(arr2[i]);
        }

        System.out.println("Union of arrays:");
        for (int num : union) {
            System.out.print(num + " ");
        }
    }
}