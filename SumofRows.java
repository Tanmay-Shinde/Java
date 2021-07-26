package Arrays.DDA;
import java.util.*;
public class SumofRows
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
        
        System.out.println("Matrix=");
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
                if(i==0)
                {
                    s0=s0+a[i][j];
                }
                if(i==1)
                {
                    s1=s1+a[i][j];
                }
                if(i==2)
                {
                    s2=s2+a[i][j];
                }
            }
        }
        
        System.out.println("Sum of 0th row - "+s0);
        System.out.println("Sum of 1st row - "+s1);
        System.out.println("Sum of 2nd row - "+s2);
    }
    static void main2()
    {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[3][3];
        int s=0;
        
        System.out.println("Enter 9 numbers");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                a[i][j]=sc.nextInt();                
            }
        }
        
        System.out.println("Matrix=");
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
            s=0;
            for(int j=0;j<3;j++)
            {
                s=s+a[i][j];
            }
            System.out.println("Sum of "+i+"th row - "+s);
        }        
    }
}
