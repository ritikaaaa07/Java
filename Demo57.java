// coloumn wise sum 
public class Demo57{
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int numRows = arr.length;
        int numCols = arr[0].length;

        for (int j = 0; j < numCols; j++) {
            int colSum = 0;
            for (int i = 0; i < numRows; i++) {
                colSum += arr[i][j];
            }
            System.out.println("sum of" + (j + 1) + "col : " + colSum);
        }
    }
}
