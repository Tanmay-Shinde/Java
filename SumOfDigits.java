package Loops.Loops_While;
import java.io.*;
public class SumOfDigits
{
    static void main()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        
        System.out.println("Enter the number");
        int n=Integer.parseInt(in.readLine());
        int t=n;
        int s=0;
        
        while(t!=0)
        {
            int a=t%10;
            s=s+a;
            t=t/10;
        }
        
        System.out.println("Sum of digits of the number "+n+" is = "+s);
    }
}
