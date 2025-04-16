import java.util.Scanner;

public class Demo42 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = in.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = in.nextInt();
        }

        System.out.println("Array in reverse order:");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }

    }
}