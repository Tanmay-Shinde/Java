package Arrays.DDA;
import java.util.*;
public class SumOfMatrices
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

            if(n>=0 && n<=10)
            {
                f=true;
            }
            else
            {
                System.out.println("The size can only be between 1 & 10");
            }
        }

        int a[][]=new int[n][n];
        int b[][]=new int[n][n];
        System.out.println("Enter the elements of the first matrix");
        for(int i =0;i<n;i++)
        {
            for(int j=0;j<n;j++)         
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the elements of the second matrix");
        for(int i =0;i<n;i++)
        {
            for(int j=0;j<n;j++)         
            {
                b[i][j]=sc.nextInt();
            }
        }

        System.out.println("Matrix A:");
        for(int i =0;i<n;i++)
        {
            for(int j=0;j<n;j++)         
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("Matrix B:");
        for(int i =0;i<n;i++)
        {
            for(int j=0;j<n;j++)         
            {
                System.out.print(b[i][j]+"\t");
            }
            System.out.println();
        }

        int c[][]=new int[n][n];
        for(int i =0;i<n;i++)
        {
            for(int j=0;j<n;j++)         
            {
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("Matrix C:");
        for(int i =0;i<n;i++)
        {
            for(int j=0;j<n;j++)         
            {
                System.out.print(c[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
