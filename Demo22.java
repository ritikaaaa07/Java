// Check whether a character is vowel or consonant using switch-case
import java.util.Scanner;
public class Demo22{
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an alphabet: ");
        char ch = scanner.next().toLowerCase().charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            switch (ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println(ch + " is a Vowel.");
                    break;
                default:
                    System.out.println(ch + " is a Consonant.");
            }
        } else {
            System.out.println("Invalid input. Please enter an alphabet character.");
        }
   
    }
} 