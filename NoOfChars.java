package Strings;
import java.util.*;
public class NoOfChars
{
    static void main()
    {
        Scanner sc= new Scanner(System.in);
        String s,a="",ns="";
        int l,l2;
        char ch;

        System.out.println("Enter a sentence");
        s=sc.nextLine();
        s=s+" ";
        l=s.length();

        System.out.println("Word \t No. of Characters");
        for(int i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(ch!=' ')
            {
                a=a+ch;
            }
            else
            {
                l2= a.length();
                System.out.println(a+"\t"+(l2-1));
                a="";
            }
        }
    }
}
