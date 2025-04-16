import java.util.Scanner;

public class Demo41 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter size of an array: ");
        int size = in.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter elements of an array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = in.nextInt();
        }

        System.out.print("Search an array: ");
        int searchNumber = in.nextInt();

        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (arr[i] == searchNumber) {
                found = true;
                System.out.println(searchNumber + "is present in the array");
                break;
            }
        }

        if (!found) {
            System.out.println(searchNumber + "is not present in the array");
        }

    }
}