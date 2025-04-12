// Print numbers from 1 to N using a for loop
import java.util.Scanner;
public class Demo23{
    public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive number (N): ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
   
    } 
}