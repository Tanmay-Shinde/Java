package Loops.Loops_For;
import java.io.*;
public class SimpleFor2
{
    void main()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        int n;
        System.out.println("Enter a value");
        n = Integer.parseInt(in.readLine());
        
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+" * "+i+" = "+(n*i));
        }
        System.out.println("Thank You");
    }
}