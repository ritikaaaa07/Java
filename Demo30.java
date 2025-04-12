// Find factorial of a number using for 
import java.util.Scanner;
public class Demo30{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative number: ");
        int num = scanner.nextInt();

        long factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}

