package Class_UDD;
import java.util.*;
public class ModString
{
    String x;
    char ch;
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        x=sc.nextLine();
        System.out.println("Enter a character");
        ch=sc.next().charAt(0);
    }
    void change()
    {
        String s=x,a="",n="";
        s=" "+s;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c!=' ')
            {
                a=a+c;
            }
            else
            {
                a=a+" "+ch;
                i++;
            }
        }
        System.out.println("The changed string is: "+a);
    }
    void next()
    {
        String nd="";
        for(int i=0;i<x.length();i++)     
        {
            char a=x.charAt(i);
            int k=(int)a;
            if((k>=65 && k<90)||(k>=97 && k<122))
            {
                nd=nd+(char)(k+1);
            }
            else if(k==90)
            {
                nd=nd+'A';
            }
            else if(k==122)
            {
                nd=nd+'a';
            }
            else if(k==32)
            {
                nd=nd+' ';
            }
            else
            {
                nd=nd+a;
            }
        }
        System.out.println("The changed string is: "+nd);
    }
    void display()
    {
        change();
        next();
    }
    void main()
    {
        ModString ob=new ModString();
        ob.accept();
        ob.display();
    }
}
