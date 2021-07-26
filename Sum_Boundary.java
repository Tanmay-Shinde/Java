package Arrays.DDA;
import java.util.*;
public class Sum_Boundary
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[3][3];
        int s0=0,s1=0,s2=0;

        System.out.println("Enter 9 numbers");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                a[i][j]=sc.nextInt();                
            }
        }

        System.out.println("The Matrix:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(a[i][j]+"\t");                
            }
            System.out.println(); 
        }

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(i==0 || i==2 || j==0 || j==2)
                {
                    s0=s0+a[i][j];
                }                
            }
        }

        System.out.println("Sum of boundary elements = "+s0);
    }

}

