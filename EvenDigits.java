package Loops.Loops_While;
import java.io.*;
public class EvenDigits
{
    static void main()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        
        System.out.println("Enter the number");
        int n=Integer.parseInt(in.readLine());
        int t=n;
        int k=0;
        
        System.out.println("The Even Digits are:");
        while(t!=0)
        {
            int a=t%10;
            if(a%2==0)
            {
                System.out.println(a);
                k++;
            }
            t=t/10;
        }
        if(k!=0)
        {
            System.out.println("There are no even digits");
        }
    }
}
