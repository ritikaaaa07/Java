// check whether a character is uppercase or lowercase
public class Demo15{
    public static void main(String[] args){
        char ch = 'C';
        if (ch >= 'A' && ch <= 'Z')
        System.out.println("Uppercase");
        else if (ch >= 'a' && ch <= 'z')
        System.out.println("Lowercase");
        else
        System.out.println("not an alphabet");
    }

}