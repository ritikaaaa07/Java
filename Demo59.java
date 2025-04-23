// max element
public class Demo59 {
    public static void main(String[] args) {
        int[][] arr = {
            {10, 25, 30},
            {44, 50, 60},
            {70, 80, 15}
        };

        int min = arr[0][0]; 

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }

        System.out.println("smallest element of matrix:" + min);
    }
}