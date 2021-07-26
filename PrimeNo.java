package Loops.Loops_For;
import java.io.*;
public class PrimeNo
{
    public static void main1()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        
        System.out.println("Enter a number to check whether it is prime");
        int n= Integer.parseInt(in.readLine());
        int k=0;
        
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                k++;
            }
        }
        if(k==2)
        {
            System.out.println(n+" is a prime number");
        }
        else
        {
            System.out.println(n+" is not a prime number");
        }
    }
    
    public static void main2()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        
        System.out.println("Enter a number to check whether it is prime");
        int n= Integer.parseInt(in.readLine());
        int k=0;
        
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                k++;
                break;
            }
        }
        if(k==0)
        {
            System.out.println(n+" is a prime number");
        }
        else
        {
            System.out.println(n+" is not a prime number");
        }
    }
    
    public static void main3()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        
        System.out.println("Enter a number to check whether it is prime");
        int n= Integer.parseInt(in.readLine());
        boolean f=false;
        
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                f= true;
                break;
            }
        }
        if(f==false)
        {
            System.out.println(n+" is a prime number");
        }
        else
        {
            System.out.println(n+" is not a prime number");
        }
    }
}
