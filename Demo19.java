// Check Even or Odd using if-else
import java.util.Scanner;
public class Demo19{
    public static void main(String[]  args){
        Scanner scanner = new Scanner(System.in);
       System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " is Even.");
        } else {
            System.out.println(number + " is Odd.");
        }
    }
} 