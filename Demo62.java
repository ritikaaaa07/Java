public class Demo62{
    public static void main(String[] args){
        StringBuilder str=new StringBuilder(11);
        str.append("hello hiiiii");
        System.out.println(str.length());
        System.out.println(str.capacity());
    }
}