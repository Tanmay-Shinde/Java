package Loops.Loops_For;
import java.io.*;
public class Largest_10
{
    public static void main()throws IOException
    {
        InputStreamReader read= new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        int n,max=0;
        
        System.out.println("Enter 10 numbers");
        n=Integer.parseInt(in.readLine());
        max=n;
        
        for(int i=0;i<10;i++)
        {
            n=Integer.parseInt(in.readLine());
            if(n>max)
            max=n;
        }
        
        System.out.println("The largestNumber is: "+max);
    }
}
