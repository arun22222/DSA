public class pattern7 {
    public static void main(String[] args) {
        pattern7(5);
    }

    public static void pattern7(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n - 1; col++) {
                if (row == 0 || row == n - 1) {
                    System.out.print("*");
                } else {
                    if ((col == 0 || col == n - 2)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}