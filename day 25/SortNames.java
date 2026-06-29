import java.util.Arrays;

public class SortNames {
    public static void main(String[] args) {
        String[] names = {"Rahul", "Amit", "Zara", "Kiran", "Bhavna"};

        // sort alphabetically
        Arrays.sort(names);

        System.out.println("Sorted Names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}