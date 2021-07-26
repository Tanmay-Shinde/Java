package Loops.Loops_For;
import java.io.*;
public class Factors
{
    public static void main()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        int n;
        System.out.println("Enter the number whose factor is to be found");
        n = Integer.parseInt(in.readLine());
        
        System.out.println("The factors of "+n+" are:");
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)            
                System.out.println(i);
        }
        System.out.println("Thank You");
    }
}