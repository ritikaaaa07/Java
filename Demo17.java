import java.util.Scanner;
public class Demo17{
    public static void main(String[] args){
       Scanner in = new Scanner(System.in);
       int a= in.nextInt();
        String dayname = "null";
       switch (a) {
        case 1 : 
            dayname = "Sunday"; 
        case 2 :
            dayname = "Monday";
        case 3  :
            dayname = "Tuesday";
        case 4 :
            dayname = "Wednesday";
        case 5 :
            dayname = "Thursday";
        case 6 :
            dayname = "Friday";
        case 7 :
            dayname = "Saturday";
            break;
            default:
                System.out.println(a);
        } 
    }
} 