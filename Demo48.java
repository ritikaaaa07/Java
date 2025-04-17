// unique element from both array
public class Demo48 {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 4, 5, 7};
        int[] array2 = {2, 3, 5, 6};

        System.out.print("Unique elements: ");

        for (int i = 0; i < array1.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.print(array1[i] + " ");
            }
        }
        for (int i = 0; i < array2.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < array1.length; j++) {
                if (array2[i] == array1[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.print(array2[i] + " ");
            }
        }
    }
}