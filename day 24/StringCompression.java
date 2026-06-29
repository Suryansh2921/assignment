public class StringCompression {
    public static String compress(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                result.append(str.charAt(i - 1));
                result.append(count);
                count = 1;
            }
        }

        // Append the last character and its count
        result.append(str.charAt(str.length() - 1));
        result.append(count);

        return result.toString();
    }

    public static void main(String[] args) {
        String str = "aaabbccccd";
        System.out.println("Original String: " + str);
        System.out.println("Compressed String: " + compress(str));
    }
}