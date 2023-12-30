import java.util.Scanner;

public class string3 {
    public static int lengthOfLastWord(String s) {
        s = s.trim();
        int lastSpaceIndex = s.lastIndexOf(' ');

        if (lastSpaceIndex == -1) {
            return s.length();
        } else {
            return s.length() - lastSpaceIndex - 1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        int length = lengthOfLastWord(input);
        System.out.println("Length of last word: " + length);
    }
}
