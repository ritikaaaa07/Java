import java.util.Scanner;
public class Demo67{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int subject1, subject2, subject3, subject4, subject5;
        int totalMarks;
        double percentage;
        
        System.out.println("Enter marks for Subject 1(out of 100): ");
        subject1 = scanner.nextInt();

        System.out.println("Enter marks for Subject 2(out of 100): ");
        subject2 = scanner.nextInt();

        System.out.println("Enter marks for Subject 3(out of 100): ");
        subject3 = scanner.nextInt();

        System.out.println("Enter marks for Subject 4(out of 100): ");
        subject4 = scanner.nextInt();

        System.out.println("Enter marks for Subject 5(out of 100): ");
        subject5 = scanner.nextInt();

        totalMarks = subject1 + subject2 + subject3 + subject4 + subject5;
        percentage = (totalMarks / 500.0) * 100;

        System.out.println("Percentage =" + percentage + "%");
    }
}