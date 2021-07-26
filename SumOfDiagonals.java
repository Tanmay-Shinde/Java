package Arrays.DDA;
import java.util.*;
public class SumOfDiagonals
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n;
        int sl=0,sr=0;

        System.out.println("Enter the size of matrix");
        n=sc.nextInt();

        int a[][]=new int[n][n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)         
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("The Matrix");
        for(int i=0;i<n;i++)
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
                if(i==j)
                {
                    sl+=a[i][j];
                }
                if((i+j)==(n-1))
                {
                    sr+=a[i][j];
                }
            }
        }
        System.out.println("Sum of left diagonal = "+sl);
        System.out.println("Sum of right diagonal = "+sr);
    }
}
