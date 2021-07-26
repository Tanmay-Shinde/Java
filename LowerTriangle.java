package Arrays.DDA;
import java.util.*;
public class LowerTriangle
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

            if(n>=1 && n<=5)
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

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)         
            {
                if(i>=j)
                {
                    s0=s0+a[i][j];
                }                
            }
        }

        System.out.println("Sum of Upper Triangle= "+s0);
    }
}
