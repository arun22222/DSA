public class string2 {
    public static String restoreString(String s, int[] indices) {
        char[] shuffled = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            shuffled[indices[i]] = s.charAt(i);
        }

        return new String(shuffled);
    }

    public static void main(String[] args) {
        String originalString = "abcde";
        int[] indices = { 4, 3, 2, 1, 0 };

        String shuffledString = restoreString(originalString, indices);
        System.out.println("Original String: " + originalString);
        System.out.println("Shuffled String: " + shuffledString);
    }
}
