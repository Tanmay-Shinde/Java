package Loops.Loops_For;
import java.io.*;
public class HCF
{
    public static void method1()throws IOException
    {
        InputStreamReader read= new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        
        int a,b,h=0;
        System.out.println("Enter two numbers");
        a=Integer.parseInt(in.readLine());
        b=Integer.parseInt(in.readLine());
        
        for(int i=1;i<=Math.min(a,b);i++)
        {
            if(a%i==0 && b%i==0)
            {
                h=i;
            }
        }
        System.out.println("The hcf of "+a+" and "+b+" is " +h);
    }
    public static void method2()throws IOException
    {
        InputStreamReader read= new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        
        int a,b,h=0;
        System.out.println("Enter two numbers");
        a=Integer.parseInt(in.readLine());
        b=Integer.parseInt(in.readLine());
        
        for(int i=Math.min(a,b);i>=1;i--)
        {
            if(a%i==0 && b%i==0)
            {
                h=i;
                break;
            }
        }
        System.out.println("The hcf of "+a+" and "+b+" is " +h);
    }
}
