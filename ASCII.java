package Strings;
import java.util.*;
public class ASCII
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word");
        String s=sc.next();
        
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            int x=(int)ch;
            System.out.println(ch+" - "+x);
        }
    }
}
