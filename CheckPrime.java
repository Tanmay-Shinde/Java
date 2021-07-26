package Functions;
import java.io.*;
public class CheckPrime
{
    boolean isPrime(int x)throws IOException
    {
        int k=0;
        for(int i=0;i<=x;i++)
        {
            if(x%i==0)
            {
                k++;
            }
        }
        if(k==2)
        {
            return(true);
        }
        else
        {
            return(false);
        }
    }
    void main()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        
        System.out.println("Enter a number");
        int n=Integer.parseInt(in.readLine());
        
        boolean k=isPrime(n);
        if(k==true)
        {
            System.out.println(n+" is a prime number");
        }
        else
        {
            System.out.println(n+" is not a prime number");
        }
    }
}
