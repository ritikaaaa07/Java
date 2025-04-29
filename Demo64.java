public class Demo64{
    public static void main(String[] args) {
        int[] arr={3,4,2,1};
        int n= 5;
        int expectedSum = n*(n+1)/2;
        int actualSum=0;
        for(int num : arr){
            actualSum+=num;            
        }
        System.out.println("Missing number" + (expectedSum - actualSum));
    }
}