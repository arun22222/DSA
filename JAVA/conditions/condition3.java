import java.util.Scanner;

public class PerimeterOfSquare {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the side length of the square: ");
        double sideLength = scanner.nextDouble();
        double perimeter = 4 * sideLength;
        System.out.println("Perimeter of the square: " + perimeter);

    }
}
