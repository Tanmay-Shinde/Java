package Loops.Loops_For;
import java.io.*;
public class Perfect_number
{
    public static void main()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        int n,s=0;
        System.out.println("Enter a number to check whether it is a perfect number or not");
        n = Integer.parseInt(in.readLine());

        for(int i=0;i<n;i++)
        {
            if(n%i==0)
            {
                s+=i;
            }
        }
        if(s==n)
        System.out.println(n+" is a perfect number");
        else
        System.out.println(n+" is not a perfect number");
    }
}
