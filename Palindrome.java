package Functions;
import java.util.*;
public class Palindrome
{
    void palin(String x)
    {
        int l=x.length();
        String t="";
        char ch;
        for(int i=0;i<l;i++)
        {
            ch=x.charAt(i);
            t=ch+t;
        }
        if(t.equals(x)==true)
        {
            System.out.println("The word is Palindrome");
        }
        else
        {
            System.out.println("The word is not Palindrome");
        }
    }
    void main()
    {
        Scanner sc=new Scanner(System.in);
        String s;
        System.out.println("Enter a word");
        s=sc.next();
        s=s.toUpperCase();
        palin(s);
    }
}
