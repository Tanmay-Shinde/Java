package Loops.Loops_While;
import java.io.*;
public class SmallestDigit
{
    static void main()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        
        System.out.println("Enter the number");
        int n=Integer.parseInt(in.readLine());
        int t=n;
        int l=n%10;
        int min=l;
        
        while(t!=0)
        {
            int a=t%10;
            if(a<min)
            {
                min=a;
            }
            t=t/10;
        }
        
        System.out.println("the smallest digit in "+n+" is = "+min);
    }
}
