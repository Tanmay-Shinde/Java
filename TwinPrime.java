package Loops.Loops_For;
import java.io.*;
public class TwinPrime
{
    public static void main()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        int a,b;
        boolean f=false, g=false;

        System.out.println("Enter two numbers");
        a=Integer.parseInt(in.readLine());
        b=Integer.parseInt(in.readLine());

        if((a-b)==2 || (b-a)==2)
        {
            for(int i=2;i<a;i++)
            {
                if(a%i==0)
                {
                    f=true;
                    break;
                }
            }
            for(int j=2;j<b;j++)
            {
                if(b%j==0)
                {
                    g=true;
                    break;
                }
            }

            if(f==false && g==false)
            {
                System.out.println(a+" and "+b+" are twin prime numbers");
            }
            else
            {
                System.out.println(a+" and "+b+" are not twin prime numbers");
            }
        }

        else
        {
            System.out.println(a+" and "+b+" are not twin prime numbers");
        }
    }
}
