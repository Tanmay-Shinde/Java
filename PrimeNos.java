package Arrays;
import java.util.*;
public class PrimeNos
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        int k=0;

        System.out.println("Enter the nos");
        for(int i=0;i<10;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.println("The prime nos. are:");
        for(int i=0;i<10;i++)
        {
            for(int j=2;j<a[i];j++)
            {
                if(a[i]%j==0)
                {
                    k++;
                    break;
                }       

            }
            if(k==0)
            {
                System.out.println(a[i]);
            }
        }
    }
}
