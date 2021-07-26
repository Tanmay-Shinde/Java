package Loops.Loops_For;
import java.io.*;
public class Positivenos
{
    public static void main()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        int n;
        
        System.out.println("Enter ten numbers");
        for(int i=0;i<10;i++)
        {
            n=Integer.parseInt(in.readLine());
            if(n>0)
            {
                System.out.println(n+" is positive");
            }
        }
    }
}
