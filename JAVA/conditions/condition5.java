import java.util.Scanner;

public class condition5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int product = 1;
        while (true) {
            System.out.print("enter integer to take product or enter zero to exit and print answer = ");
            int i = input.nextInt();
            if (i == 0) {
                break;
            } else {
                product = i;
            }
        }
        System.out.println("the final product is = " + product);
    }
}