package Strings;
import java.util.*;
public class LongestWord
{
    static void main()
    {
        Scanner sc= new Scanner(System.in);
        String s,a="",c="";
        int l,x,k=0;
        char ch;
        
        System.out.println("Enter a sentence");
        s=sc.nextLine();
        s=s+" ";
        l=s.length();
        
        for(int i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(ch!=' ')
            {
                a=a+ch;
            }
            else
            {
                x=a.length();
                if(x>k)
                {
                    k=x;
                    c=a;
                }
                a="";
            }
        }
        System.out.println("The Longest Word is: "+c);
        System.out.println("The Length of the word is: "+k);
    }
}
