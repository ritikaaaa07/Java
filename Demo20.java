// Check Positive, Negative or Zero
import java.util.Scanner;
public class Demo20{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
    System.out.print("Enter a number: ");
        double number = scanner.nextDouble();
        if (number > 0) {
            System.out.println(number + " is Positive.");
        } else if (number < 0) {
            System.out.println(number + " is Negative.");
        } else {
            System.out.println("The number is Zero.");
        }
    
    }
}