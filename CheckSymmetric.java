package Functions;
import java.io.*;
public class CheckSymmetric
{
    boolean isSymmetric(int a[][])
    {
        int T[][]=new int[3][3];
        boolean f=true;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                T[j][i]=a[i][j];
            }
        }

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(!(T[i][j]==a[i][j]))
                {
                    f=false;
                }
            }
        }
        if(f==true)
        {
            return(true);
        }
        else
        {
            return(false);
        }
    }
    void main()throws IOException
    {
        InputStreamReader read =new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        
        
        int m[][]=new int[3][3];
        System.out.println("Enter 9 values in the matrix");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)        
            {
                m[i][j]=Integer.parseInt(in.readLine());
            }
        }
        boolean res = isSymmetric(m);
        if(res==true)
        {
            System.out.println("The matrix is Symmetric");
        }
        else
        {
            System.out.println("The matrix is not Symmetric");
        }
    }
}
