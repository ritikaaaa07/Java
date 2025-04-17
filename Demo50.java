// Find Maximum from Two Arrays
public class Demo50{
    public static void main(String[] args) {
        int[] arr1 = {10,30,35};
        int[] arr2 = {15,93,12};
        int max = Integer.MIN_VALUE;

        for (int val : arr1) {
            if (val > max) {
                max = val;
            }
        }
        for (int val : arr2) {
            if (val > max) {
               max = val;
            }
        }
        System.out.println("Maximum element: " + max);

    
    }
}
