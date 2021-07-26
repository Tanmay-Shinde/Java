package Strings;
import java.util.*;
public class Word_EvenPlaces
{
    static void main()
    {
        Scanner sc= new Scanner(System.in);
        String s,a="",ns="";
        int l,l2,sp=0;
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
                sp++;
                if(sp%2==0)
                {
                    ns=ns+" "+a;
                }
                a="";
            }
            
        }
        System.out.println(ns);
    }
}
