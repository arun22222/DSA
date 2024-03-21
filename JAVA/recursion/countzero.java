public class countzero {
    public static void main(String[] args) {
        System.out.println(countzero(30204));
    }

    static int countzero(int n) {
        return helper(n, 0);
    }

    public static int helper(int n, int count) {
        if (n == 0) {
            return count;
        }
        int rem = n % 10;
        if (rem == 0) {
            return helper(n / 10, count + 1);
        } else {
            return helper(n / 10, count);
        }
    }
}