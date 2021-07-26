package Strings;
import java.util.*;
public class End_Vowel
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        String s,a="";
        int l,l2=0;
        char ch,ch2;
        
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
                l2=a.length();
                ch2=a.charAt(l2-1);
                if(ch2=='a'||ch2=='e'||ch2=='i'||ch2=='o'||ch2=='u'||ch2=='A'||ch2=='E'||ch2=='I'||ch2=='O'||ch2=='U')
                {
                    System.out.println(a+"\t"+l2);
                }
                a="";
            }
        }
    }
}
