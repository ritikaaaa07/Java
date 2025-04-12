// Check whether a number is a multiple of 3 or not using if-else
import java.util.Scanner;
public class Demo28{
    public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (number % 3 == 0) {
            System.out.println(number + " is a multiple of 3.");
        } else {
            System.out.println(number + " is NOT a multiple of 3.");
        }

    }
}
