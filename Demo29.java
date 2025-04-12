//Take a character input and print its ASCII value (Type casting)
import java.util.Scanner;
public class Demo29{
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        int asciiValue = (int) ch;
        System.out.println("The ASCII value of '" + ch + "' is: " + asciiValue);    
    }
}