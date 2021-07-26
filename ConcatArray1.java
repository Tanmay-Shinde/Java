package Arrays;
import java.io.*;
public class ConcatArray1
{
    static void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int k=0;
        
        int A[]=new int[10];
        int B[]=new int[10];
        
        System.out.println("Enter elements of array A");
        for(int i=0;i<10;i++)
        {
            A[i]= Integer.parseInt(in.readLine());
        }
        System.out.println("Enter elements of array B");
        for(int i=0;i<10;i++)
        {
            B[i]= Integer.parseInt(in.readLine());
        }
        
        int C[]=new int[20];
        
        for(int i=0;i<20;i++)
        {
            if(i<10)
            {
                C[i]=A[i];
            }
            else
            {
                C[i]=B[9-k];
                k++;
            }
        }
        
        System.out.print("A[]=");
        for(int i=0;i<10;i++)
        {
            System.out.print(A[i]+",");
        }
        System.out.println();
        System.out.print("B[]=");
        for(int i=0;i<10;i++)
        {
            System.out.print(B[i]+",");
        }
        System.out.println();
        System.out.print("C[]=");
        for(int i=0;i<20;i++)
        {
            System.out.print(C[i]+",");
        }
    }
}
