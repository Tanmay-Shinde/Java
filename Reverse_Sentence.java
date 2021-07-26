package Strings;
import java.util.*;
public class Reverse_Sentence
{
    static void main()
    {
        Scanner sc= new Scanner(System.in);
        String s,a="",ns="";
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
                ns = a+" "+ns;
                a="";
            }
        }
        System.out.println("TReversed Sentence is: "+ns);
    }
}
