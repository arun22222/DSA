public class string4 {
    public static void main(String[] args) {
        int[] indices = { 0, 5, 6, 7, 8, 1, 2, 3, 4 };
        System.out.println(restoreString("StorePlay", indices));
    }

    public static String restoreString(String s, int[] indices) {
        char[] result = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            result[indices[i]] = s.charAt(i);
        }
        return new String(result);
    }
}
