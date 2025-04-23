public class Demo60{
    public static void main(String[] args) {
        String str="helloo";
        String newStr="h";
        for (int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(newStr.indexOf(c)==-1){
                newStr=newStr+c;
                }
        }
        System.out.println(newStr + "  ");
    }
}