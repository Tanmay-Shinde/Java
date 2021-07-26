package Arrays.DDA;
import java.io.*;
public class SumOfRows_126
{
    static void main()throws IOException
    {
        InputStreamReader read =new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        int m,s=0;
        System.out.println("Please enter the order of the matrix");
        m=Integer.parseInt(in.readLine());
        while(!(m>2&&m<10))
        {
            System.out.println("The valid values of 'm' are 2<m<10");
            System.out.println("Please enter the value again");
            m=Integer.parseInt(in.readLine());
        }

        int A[][]=new int[m][m];

        System.out.println("Please enter the elements of the matrix");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                A[i][j]=Integer.parseInt(in.readLine());
            }
        }
        
        System.out.println("The matrix");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(A[i][j]+"\t");
            }
            System.out.println();
        }
        
        int B[]=new int[m];
        
        for(int i=0;i<m;i++)
        {
            s=0;
            for(int j=0;j<m;j++)
            {
                s=s+A[i][j];
            }
            B[i]=s;
        }  
        
        System.out.print("Array B[]:");
        for(int i=0;i<m;i++)
        {
            System.out.print(B[i]+", ");
        }
        int max=B[0];
        
        for(int i=0;i<m;i++)
        {
            if(B[i]>max)         
            {
                max=B[i];
            }
        }
        System.out.println();
        System.out.print("The maximum value in B[] is = "+max);
    }
}
