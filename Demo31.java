//Write a program to reverse a number using while loop 
import java.util.Scanner;
public class Demo31{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int number = scanner.nextInt();
        int originalNumber = number;  
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;           
            reversed = reversed * 10 + digit;  
            number = number / 10;              
        }
        System.out.println("Reversed number of " + originalNumber + " is: " + reversed);
    } 
}