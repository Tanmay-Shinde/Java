package Loops.Loops_For.Nested_For;
import java.io.*;
public class NumeroUnico //Unique Number
{
    static void main()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        boolean flag=false;

        System.out.println("Enter a number");
        int n=Integer.parseInt(in.readLine());
        int t=n;
        int s=n;
        while(t!=0)
        {
            int a=t%10;
            while(s!=0)
            {
                int b=s%10;
                if(a==b)            
                {
                    flag = true;
                    break;
                }
                s=s/10;
            }
            s=n;
            a=a/10;
        }
        if(flag==false)
            System.out.println("It is a unique number");
        else
            System.out.println("It is not a unique number");
    }
}
