package Loops.Loops_For;
import java.io.*;
public class Series
{
    public static void main1()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        int a;
        double sum=0.0d;
        
        System.out.println("Enter the value of a");
        a=Integer.parseInt(in.readLine());
        
        for(int i=1;i<=10;i++)
        {
            sum = sum + Math.pow(a,i);
        }
        System.out.println("Sum = "+sum);
    }
    public static void main2()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        int a,n;
        double sum=0.0d;
        
        System.out.println("Enter the value of a");
        a=Integer.parseInt(in.readLine());
        System.out.println("Enter the value of n");
        n=Integer.parseInt(in.readLine());
        
        for(int i=1;i<=n;i++)
        {
            sum = sum + (a/i);
        }
        System.out.println("Sum = "+sum);
    }
}
