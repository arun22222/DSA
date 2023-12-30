import java.util.Scanner;

public class searching2 {
    public static int arrangeCoins(int n) {
        long left = 1, right = n;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long sum = mid * (mid + 1) / 2;

            if (sum == n) {
                return (int) mid;
            } else if (sum < n) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return (int) right;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total number of coins: ");
        int totalCoins = scanner.nextInt();

        int result = arrangeCoins(totalCoins);
        System.out.println("The number of full staircases that can be formed: " + result);

        scanner.close();
    }
}
