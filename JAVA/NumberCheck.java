import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (num > 0) {
            System.out.println(num + " is a Positive number.");
        } else if (num < 0) {
            System.out.println(num + " is a Negative number.");
        } else {
            System.out.println("The number is Zero.");
        }

        scanner.close();
    }
}
