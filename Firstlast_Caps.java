package Strings;
import java.util.*;
public class Firstlast_Caps
{
    static void main()
    {
        Scanner sc= new Scanner(System.in);
        String s,a="",na="",ns="";
        int l,x,k=0;
        char ch,ch1,ch2;
        
        System.out.println("Enter a sentence");
        s=sc.nextLine();
        s=s+" ";
        s=s.toLowerCase();
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
        System.out.println("Reversed Sentence is: "+ns);
    }
}
