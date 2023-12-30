public class string1 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        boolean areEqual = str1.equals(str2);
        System.out.println("Using equals(): Strings are equal - " + areEqual);
        int result = str1.compareTo(str2);
        areEqual = (result == 0);
        System.out.println("Using compareTo(): Strings are equal - " + areEqual);
    }
}
