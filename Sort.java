package Functions;
import java.io.*;
public class Sort
{
    static void sort(int a[])throws IOException
    {
        int l=a.length,min=0,t=0;
        
        for(int i=0;i<10;i++)
        {
            min=i;
            for(int j=i+1;j<10;j++)
            {
                if(a[j]>a[min])                
                {
                    min=j;
                }
            }
            t=a[min];
            a[min]=a[i];
            a[i]=t;
        }
        System.out.println("The sorted array is:");
        for(int i=0;i<10;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    static void main()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int a[]=new int[10];
        System.out.println("Enter 10 numbers in the array");
        for(int i=0;i<10;i++)
        {
            a[i]=Integer.parseInt(in.readLine());
        }
        sort(a);
    }
}
