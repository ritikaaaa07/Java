// copy elements of one array into another
public class Demo49 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = new int[arr1.length];
    
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        System.out.println("Copied array:");
        for (int val : arr2) {
            System.out.print(val + " ");
        }
    }
}
