package Arrays;
import java.util.*;
public class LinearSearch
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        int k=0,ns;

        System.out.println("Enter the nos");
        for(int i=0;i<10;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the number to be searched");
        ns=sc.nextInt();

        for(int i=0;i<10;i++)
        {
            if(a[i]==ns)
            {
                k=1;
                break;
            }       
        }
        if(k==1)
        {
            System.out.println("Number found");
        }
        else
        {
            System.out.println("Number not found");
        }
    }
}
