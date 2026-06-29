import java.util.ArrayList;

public class CommonCharacters {
    public static void main(String[] args) {
        String str1 = "programming";
        String str2 = "gaming";

        ArrayList<Character> common = new ArrayList<>();

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        // count frequency of characters in both strings
        for (char ch : str1.toCharArray()) {
            freq1[ch - 'a']++;
        }

        for (char ch : str2.toCharArray()) {
            freq2[ch - 'a']++;
        }

        // find common characters
        for (int i = 0; i < 26; i++) {
            if (freq1[i] > 0 && freq2[i] > 0) {
                common.add((char) (i + 'a'));
            }
        }

        System.out.println("Common characters: " + common);
    }
}