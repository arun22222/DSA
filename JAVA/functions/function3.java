import java.util.Scanner;

public class function3 {
    public static void checkEligibility(int age) {
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int personAge = scanner.nextInt();
        checkEligibility(personAge);

    }
}
