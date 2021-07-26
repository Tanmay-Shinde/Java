package Arrays;
import java.util.*;
public class Sort_Word
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a word");        
        String a=sc.next();
        a=a.toUpperCase();
        int l=a.length();
        int min=0;
        char t='\u0000';
        
        char w[]=new char[l];        
        for(int j=0;j<l;j++)
        {
            w[j]=a.charAt(j);
        }
        for(int i=0;i<l;i++)
        {
            min=i;
            for(int j=i+1;j<l;j++)
            {
                if(w[j]<w[min])                
                {
                    min=j;
                }
            }
            t=w[min];
            w[min]=w[i];
            w[i]=t;
        }
        System.out.println("The sorted array is:");
        for(int i=0;i<l;i++)
        {
            System.out.println(w[i]);
        }
    }
}
