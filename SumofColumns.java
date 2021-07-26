package Arrays.DDA;
import java.util.*;
public class SumofColumns
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n=0,s0=0,s1=0,s2=0;
        boolean f=false;

        while(f!=true)
        {
            System.out.println("Enter size of the array");
            n=sc.nextInt();

            if(n>=2 && n<=4)
            {
                f=true;
            }
            else
            {
                System.out.println("The size can only be 2/3/4");
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

        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)         
            {
                if(j==0)
                {
                    s0=s0+a[i][j];
                }
                if(j==1)
                {
                    s1=s1+a[i][j];
                }
                if(j==2)
                {
                    s2=s2+a[i][j];
                }
            }
        }
        
        System.out.println("ESum of 0th column = "+s0);
        System.out.println("ESum of 1st column = "+s1);
        System.out.println("ESum of 2nd column = "+s2);
    }
}
