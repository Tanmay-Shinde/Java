package Arrays.DDA;
import java.io.*;
public class Symmetric_127
{
    static void main()throws IOException
    {
        InputStreamReader read =new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        int m,n=0;
        boolean flag=false,flag2=false,f=true;

        System.out.println("Please enter the order of the matrix");
        m=Integer.parseInt(in.readLine());
        while(!(m>0 && m<20))
        {
            System.out.println("The valid values of 'm' are 0<m<20");
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
                while(!(A[i][j]>0))
                {
                    System.out.println("You can only enter a positive integer");
                    System.out.println("Please enter the value again");
                    A[i][j]=Integer.parseInt(in.readLine());
                }
            }
        }
        System.out.println();
        System.out.println("The matrix:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(A[i][j]+"\t");
            }
            System.out.println();
        }

        int T[][]=new int[m][m];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                T[j][i]=A[i][j];
            }
        }

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(!(T[i][j]==A[i][j]))
                {
                    f=false;
                }
            }
        }
        if(f==true)
        {
            System.out.println("THE MATRIX IS SYMMETRIC");
        }
        else
        {
            System.out.println("THE MATRIX IS NOT SYMMETRIC");
        }
        System.out.println();
        System.out.println("Prime No."+"\t"+"Row"+"\t\t"+"Column");  
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                int s=A[i][j];
                int r=0;
                for(int k=1;k<=s;k++)
                {
                    if(s%k==0)                 
                    {
                        r++;
                    }
                }
                if(r==2)
                {
                    for(int g=0;g<m;g++)
                    {
                        flag=false;
                        flag2=false;
                        for(int h=0;h<m;h++)                     
                        {
                            if(A[g][h]==s && g!=i && h!=j)
                            {
                                flag=true;
                                flag2=true;
                                break;
                            }
                            if(g==i && h==j)
                            {
                                flag=true;
                                flag2=false;
                                break;
                            }
                        }
                        if(flag==true)
                        {
                            break;
                        }
                    }
                    if(flag2==false)
                    {
                        System.out.println(s+"\t\t"+(i+1)+"\t\t"+(j+1));
                    }
                }
            }
        }

    }
}
