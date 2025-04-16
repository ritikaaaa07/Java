public class Demo35{
    public static void main(String[] args) {
        int a =123;
        int sum = 0;
        while (a != 0) {
            sum +=a % 10;

            a /=  10;
            } 
            System.out.println("Sum of  digit: " + sum);
    }
}