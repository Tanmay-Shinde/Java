package Arrays.DDA;
import java.io.*;
public class CharDesign
{
    static void main()throws IOException
    {
        InputStreamReader read =new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        int m,s=0;
        char ch1,ch2,ch3;
        System.out.println("Please enter the order of the matrix");
        m=Integer.parseInt(in.readLine());
        while(!(m>0&&m<10))
        {
            System.out.println("The valid values of 'm' are 2<m<10");
            System.out.println("Please enter the value again");
            m=Integer.parseInt(in.readLine());
        }
        System.out.println();
        
        System.out.println("Enter character 1");
        ch1=in.readLine().charAt(0);
        System.out.println("Enter character 2");
        ch2=in.readLine().charAt(0);
        System.out.println("Enter character 3");
        ch3=in.readLine().charAt(0);
        
        char A[][]=new char[m][m];

        System.out.println("Please enter the elements of the matrix");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(i==j || (i+j)==(m-1))
                {
                    A[i][j]=ch3;
                }
                else if(i<j)
                {
                    if((i+j)<(m-1))                 
                    {
                        A[i][j]=ch1;
                    }
                    else
                    {
                        A[i][j]=ch2;
                    }
                }
                else if(i>j)
                {
                    if((i+j)<(m-1))                 
                    {
                        A[i][j]=ch2;
                    }
                    else
                    {
                        A[i][j]=ch1;
                    }
                }
            }
        }
        
        System.out.println("The matrix");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
    }
}
