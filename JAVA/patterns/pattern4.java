public class pattern4 {

    public static void main(String[] args) {
        pattern4(5);
    }

    public static void pattern4(int n) {
        int x = 1;
        int col;
        for (int row = 1; row <= n; row++) {
            for (col = 1; col <= row; col++) {
                System.out.print(x + " ");
                x++;
            }
            System.out.println();
        }
    }
}
