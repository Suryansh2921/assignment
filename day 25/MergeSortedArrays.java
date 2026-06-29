import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7};
        int[] b = {2, 4, 6, 8};

        int[] merged = mergeArrays(a, b);

        System.out.println("Merged Array: " + Arrays.toString(merged));
    }

    public static int[] mergeArrays(int[] a, int[] b) {
        int i = 0, j = 0, k = 0;

        int[] result = new int[a.length + b.length];

        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                result[k++] = a[i++];
            } else {
                result[k++] = b[j++];
            }
        }

        // copy remaining elements
        while (i < a.length) {
            result[k++] = a[i++];
        }

        while (j < b.length) {
            result[k++] = b[j++];
        }

        return result;
    }
}
