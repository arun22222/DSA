import java.util.Scanner;

public class searching1 {
    public static int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }

        long left = 1, right = x;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long square = mid * mid;

            if (square == x) {
                return (int) mid;
            } else if (square < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return (int) right;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int result = mySqrt(num);
        System.out.println("Square root of " + num + ": " + result);

        scanner.close();
    }
}
