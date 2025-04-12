// Sum of first N natural numbers using while loop 
import java.util.Scanner;
public class Demo24{
    public static void main(String[] ags){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive number (N): ");
        int n = scanner.nextInt();

        int sum = 0;
        int i = 1;

        while (i <= n) {
            sum += i;
            i++;
        }

        System.out.println("Sum of first " + n + " natural numbers is: " + sum); 
    }
} 