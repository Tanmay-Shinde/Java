package Arrays;
import java.util.*;
public class StoringSentence
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        String s="",n="";
        int sp=0,j=0;
        System.out.println("Enter the sentence");
        s=sc.nextLine();
        s+=" ";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch==' ')
            {
                sp++;
            }
        }
        String a[]=new String[sp];

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
            {
                n=n+ch;
            }
            else
            {
                a[j]=n;
                n="";
                j++;
            }
        }

        System.out.println("Words starting with consonants are:");
        for(int i=0;i<sp;i++)
        {
            String c=a[i];
            char ch2=c.charAt(0);
            if(ch2!='a' && ch2!='e'&& ch2!='i'&& ch2!='o'&& ch2!='u'&& ch2!='A'&& ch2!='E'&& ch2!='I'&& ch2!='O'&& ch2!='U')
            {
                System.out.println(a[i]);
            }
        }
    }
}
