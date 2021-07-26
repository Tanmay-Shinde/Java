package Arrays;
import java.util.*;
public class Name_Marks
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        String n[]=new String[10];
        int m[]=new int[10];
        int k=0,t=0;
        String ns;

        
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter the name");
            n[i]=sc.next();
            System.out.println("Enter the nos");
            m[i]=sc.nextInt();
        }
        System.out.println("Enter the name to be searched");
        ns=sc.next();

        for(int i=0;i<10;i++)
        {
            if(n[i].equalsIgnoreCase(ns))
            {
                k=1;
                t=i;
                break;
            }       
        }
        if(k==1)
        {
            System.out.println("Marks for "+ns+" are "+m[t]);
        }
        else
        {
            System.out.println("Search Unsuccesssful");
        }
    }
}
