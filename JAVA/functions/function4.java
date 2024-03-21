import java.util.Scanner;

public class function4 {
    public static void grades(int marks) {
        if (marks >= 91 && marks <= 100) {
            System.out.println("your grade is A+");
        } else if (((marks >= 81) && (marks <= 90))) {
            System.out.println("your grade is a");
        } else if (((marks >= 71) && (marks <= 80))) {
            System.out.println("your grade is B+");
        } else if (((marks >= 61) && (marks <= 70))) {
            System.out.println("your grade is B");
        } else if ((marks >= 51) && (marks <= 60)) {
            System.out.println("your grade is C+");
        } else if (((marks >= 41) && (marks <= 50))) {
            System.out.println("your grade is c");
        } else if (marks <= 40) {
            System.out.println("your grade is fail");
        } else {
            System.out.println("not a valid input");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your marks to check grade = ");
        int x = input.nextInt();
        grades(x);
    }
}