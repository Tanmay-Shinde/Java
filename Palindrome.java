package Loops.Loops_While;
import java.io.*;
public class Palindrome
{
    public static void main()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.println("Enter the number");
        int n=Integer.parseInt(in.readLine());
        int t=n;
        int rev=0;

        while(t!=0)
        {
            int a=t%10;
            rev = rev*10+a;
            t=t/10;
        }
        if(n==rev)
        {
            System.out.println(n+" is a Palindrome number");
        }
        else
        {
            System.out.println(n+" is not a Palindrome number");
        }
    }

    public static void main2()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.println("Enter the number");
        int n=Integer.parseInt(in.readLine());
        int t=n;
        int rev=0;

        while(t!=0)
        {
            int a=t%10;
            rev = rev*10+a;
            t=t/10;
        }
        if(n==rev)
        {
            if(n<-10 || n>10)
            {
                System.out.println(n+" is a Palindrome number");
            }
            else
            {
                System.out.println(n+" is not a Palindrome number");
            }
        }
        else
        {
            System.out.println(n+" is not a Palindrome number");
        }
    }
}
