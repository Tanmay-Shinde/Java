package Arrays;
import java.util.*;
public class City_Rainfall2
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        String a[]=new String[10];//Declaration of array
        int m[]=new int[10];
        int min=0;
        String t="";
        int tm=0;
               
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter the name of city");
            a[i]=sc.next();
            System.out.println("Enter the respective rainfall");
            m[i]=sc.nextInt();
        }
        for(int i=0;i<10;i++)
        {
            min=i;
            for(int j=i+1;j<10;j++)
            {
                if(m[j]<m[min])                
                {
                    min=j;
                }
            }
            t=a[min];
            a[min]=a[i];
            a[i]=t;
            
            tm=m[min];
            m[min]=m[i];
            m[i]=tm;
        }
        System.out.println("Student \t Marks");
        for(int i=0;i<10;i++)
        {
            System.out.println(a[i]+"\t"+m[i]);
        }
    }
}
