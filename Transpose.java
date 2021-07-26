package Arrays.DDA;
import java.util.*;
public class Transpose
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[4][4];
        int s0=0,s1=0,s2=0;
        
        System.out.println("Enter 16 numbers");
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                a[i][j]=sc.nextInt();                
            }
        }
        
        System.out.println("The matrix");
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(a[i][j]+"\t");                
            }
            System.out.println(); 
        }
        
        int T[][]=new int[4][4];
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                T[j][i]=a[i][j];
            }
        }
        
        System.out.println("Transpose of matrix");
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(T[i][j]+"\t");
            }
            System.out.println();
        }
    }
}