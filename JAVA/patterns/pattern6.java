public class pattern6 {

    public static void main(String[] args) {
        pattern6(5);
    }

    public static void pattern6(int n) {
        for (int row = 0; row < (2 * n); row++) {
            int totalcolsinrows = row > n ? 2 * n - row : row;
            int noofspaces = n - totalcolsinrows;
            for (int s = 0; s < noofspaces; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalcolsinrows; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
