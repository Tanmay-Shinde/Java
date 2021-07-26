package Arrays;
import java.io.*;
public class BubbleSort
{
    static void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        
        int m[]=new int[6];
        int t;
        
        System.out.println("Enter 6 array elements");
        for(int i=0;i<6;i++)
        {
            m[i]=Integer.parseInt(in.readLine());            
        }
        
        System.out.println("The inputted array is");
        for(int i=0;i<6;i++)
        {
            System.out.print(m[i]+",");           
        }
        
        for(int i=0;i<m.length-1;i++)
        {
            for(int j=0;j<(m.length-1-i);j++)         
            {
                if(m[j]>m[j+1])
                {
                    t=m[j];
                    m[j]=m[j+1];
                    m[j+1]=t;
                }
            }
        }
        
        System.out.println();
        System.out.println("The sorted array is");
        for(int i=0;i<6;i++)
        {
            System.out.print(m[i]+",");           
        }
    }
}
