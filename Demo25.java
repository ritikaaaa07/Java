// Print multiplication table of a number using loop
import java.util.Scanner;
public class Demo25{
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter a number to print its multiplication table: ");
        int number = scanner.nextInt();
        System.out.println("Multiplication table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }  
    }
}