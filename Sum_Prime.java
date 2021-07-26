package Arrays;
import java.util.*;
public class Sum_Prime
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        int b[]=new int[10];
        int k=0;
        
        System.out.println("Enter 10 numbers");
        for(int i=0;i<10;i++)
        {
            b[i]=sc.nextInt();
        }
        
        System.out.println("The numbers whose sum of digits is prime are:");
        for(int i=0;i<10;i++)
        {
            int a=b[i];
            int s=0;
            while(a!=0)
            {
                int t=a%10;
                s=s+t;
                a=a/10;
            }
            for(int j=2;j<s;j++)
            {
                if(s%j==0)             
                {
                    k++;
                    break;
                }                
            }
            if(k==0)
            {
                System.out.println(b[i]);
            }
        }
    }
}
