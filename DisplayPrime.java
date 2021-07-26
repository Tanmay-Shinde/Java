package Arrays.DDA;
import java.util.*;
public class DisplayPrime
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n=0;
        boolean f=false;
        
        while(f!=true)
        {
            System.out.println("Enter size of the array");
            n=sc.nextInt();

            if(n>=0 && n<=5)
            {
                f=true;
            }
            else
            {
                System.out.println("The size can only be between 1-5");
            }
        }

        int a[][]=new int[n][n];
        System.out.println("Enter the elements of the array");
        for(int i =0;i<n;i++)
        {
            for(int j=0;j<n;j++)         
            {
                a[i][j]=sc.nextInt();
            }
        }

        System.out.println("The matrix");
        for(int i =0;i<n;i++)
        {
            for(int j=0;j<n;j++)         
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("The prime numbers are:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)         
            {
                int flag =0;
                int t=a[i][j];
                for(int k=1;k<=t;k++)
                {
                    if(t%k==0)                 
                    {
                        flag++;
                    }
                }
                if(flag==2)
                {
                    System.out.println(a[i][j]);                    
                }
            }
        }
    }
}
