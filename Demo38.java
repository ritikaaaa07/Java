import java.util.Scanner;

public class Demo38{
    public static void main(String[] args){
        Scanner in=  new Scanner(System.in);

        System.out.print("Enter the size of an Array");
        int size = in.nextInt();

        int[] array = new int[size];
        int sum = 0;

        System.out.println("Enter elements of an Array ");
        for (int i = 0; i < size; i++) {
           System.out.println("Element" + (i+1) + ":");
            array[i] = in.nextInt();
            sum += array[i];
        }

        System.out.println("sum of all elements of an array"  + sum);
         
    }
     

}

