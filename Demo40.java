import java.util.Scanner;

public class Demo40 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter size of an array: ");
        int size = in.nextInt();

        int[] arr = new int[size];
        int evenCount = 0;
        int oddCount = 0;

        System.out.println("Enter elements of an array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = in.nextInt();

            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);

    }
}