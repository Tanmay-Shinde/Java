package Strings;
import java.util.*;
public class WordFrequency
{
    static void main()
    {
        Scanner sc= new Scanner(System.in);
        String s,a="";
        int l,k=0;
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
                if(a.equalsIgnoreCase("the"))
                {
                    k++;
                }
                a="";
            }
        }
        System.out.println("Occurence of word \"the\" are "+k);
    }
}
