package Arrays;
import java.util.*;
public class NameSearch
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        String a[]=new String[10];
        int k=0;
        String ns="";

        System.out.println("Enter the first names of your friends");
        for(int i=0;i<10;i++)
        {
            a[i]=sc.next();
        }
        System.out.println("Enter the name to be searched");
        ns=sc.next();

        for(int i=0;i<10;i++)
        {
            String c=a[i];
            if(c.equalsIgnoreCase(ns))
            {
                k=1;
                break;
            }       
        }
        if(k==1)
        {
            System.out.println("Friend Present");
        }
        else
        {
            System.out.println("Friende not found");
        }
    }
}
