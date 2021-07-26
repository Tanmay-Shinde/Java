package Loops.Loops_While;
import java.io.*;
public class DYWTC
{
    public static void main()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        while(true)
        {
            System.out.println("Enter a number");
            int n=Integer.parseInt(in.readLine());
            if(n>0)
            {
                System.out.println("The number is positive"); 
            }
            else if(n<0)
            {
                System.out.println("The number is negative"); 
            }
            else
            {
                System.out.println("The number is ZERO"); 
            }

            System.out.println("Do you wish to continue?");
            System.out.println("Enter 0 to stop and any other number to continue");
            int ch=Integer.parseInt(in.readLine());
            if(ch==0)
            {
                break;
            }
            else
            {
                continue;
            }
        }
        System.out.println("Execution Ends. Thank You!");
    }
}
