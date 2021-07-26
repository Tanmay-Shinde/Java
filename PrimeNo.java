package Functions;
import java.io.*;
public class PrimeNo
{    
    static void isPrime()throws IOException  
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in =new BufferedReader(read);
        
        System.out.println("Please enter a number");
        int s=Integer.parseInt(in.readLine());
        int k=0;
        for(int i=1;i<=s;i++)
        {
            if(s%i==0)
            {
                k++;
            }
        }
        if(k==2)
        {
            System.out.println(s+" is a prime number");
        }
        else
        {
            System.out.println(s+" is not a prime number");
        }
    }
    static void main()throws IOException  
    {
        isPrime();
    }
}
