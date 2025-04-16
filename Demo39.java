import java.util.Scanner;

public class Demo39{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a size of an array: ");
        int size = in.nextInt();

        int[] array = new int[size];

        System.out.println("Ente elements of an array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = in.nextInt();
        }

        int max = array[0]; 
        for (int i = 1; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("Greatest element of an Array: " + max);

    }
}