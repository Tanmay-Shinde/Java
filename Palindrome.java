package Strings;
import java.util.*;
public class Palindrome
{
    static void main()
    {
        Scanner sc= new Scanner(System.in);
        String s,a="";
        int l;
        char ch;
        boolean k=false;

        System.out.println("Enter a word");
        s=sc.next();
        l=s.length();

        for(int i=0;i<l;i++)
        {
            ch = s.charAt(i);            
            a=ch+a;
             
        }
        if(a.equalsIgnoreCase(s))
            System.out.println(s+" is a palindrome word");
        else
            System.out.println(s+" is not a palindrome word");
    }
}
