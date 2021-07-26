package Arrays;
import java.util.*;
public class SelectionSort3
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        String a[]=new String[16];//Declaration of array
        int min=0;
        String t="";
        
        System.out.println("Enter the names");
        for(int i=0;i<16;i++)
        {
            a[i]=sc.next();
        }
        for(int i=0;i<15;i++)
        {
            min=i;
            for(int j=i+1;j<15;j++)
            {
                if(a[j].compareToIgnoreCase(a[min])<0)                
                {
                    min=j;
                }
            }
            t=a[min];
            a[min]=a[i];
            a[i]=t;
        }
        System.out.println("The sorted array is:");
        for(int i=0;i<16;i++)
        {
            System.out.println(a[i]);
        }
    }
}
