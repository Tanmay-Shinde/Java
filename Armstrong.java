package Loops.Loops_While;
import java.io.*;
public class Armstrong
{
    static void main()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.println("Enter the number");
        int n=Integer.parseInt(in.readLine());
        int t=n;
        double s=0.0d;

        while(t!=0)
        {
            int a=t%10;
            s=s+Math.pow(a,3);
            t=t/10;
        }
        if(n==(int)s)
        {
            System.out.println(n+" is an Armstrong number");
        }
        else
        {
            System.out.println(n+" is not an Armstrong number");
        }
    }
}
