public class Demo51{
    public static void main(String[] args){
        int[][] arr= {{1,2,3,4},{3,4,5,6}};
         int totalCount=0;

                    
        
        for (int i = 0;i<arr.length;i++){
            totalCount=totalCount+arr[i].length;
         }

         System.out.println(totalCount);
    }
}