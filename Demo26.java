// Check whether a number is divisible by 5 and 11 using if-else 
import java.util.Scanner;
public class Demo26{
    public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);
     System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (number % 5 == 0 && number % 11 == 0) {
            System.out.println(number + " is divisible by both 5 and 11.");
        } else {
            System.out.println(number + " is NOT divisible by both 5 and 11.");
        }
    }
}    
  