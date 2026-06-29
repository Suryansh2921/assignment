
import java.util.Arrays;
import java.util.Comparator;

public class SortWordsByLength {
    public static void main(String[] args) {
        String sentence = "Java is a powerful programming language";

        String[] words = sentence.split(" ");

        // sort by length of words
        Arrays.sort(words, Comparator.comparingInt(String::length));

        System.out.println("Words sorted by length:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}