import java.util.Scanner;
class Demo18{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your 1st number"); 
        int a = in.nextInt();
        System.out.println("Enter your 2nd number");
        int b = in.nextInt();
        System.out.println("Enter your command");
        char c = in.next().charAt(0);
        switch (c) {
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;              
            case '/':
                System.out.println(a/b);
                default:
                    System.out.println("error....");

        }
    }
}
   