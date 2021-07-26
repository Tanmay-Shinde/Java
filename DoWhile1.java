package Loops.Loops_DoWhile;
import java.io.*;
public class DoWhile1
{
    public static void main()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        
        System.out.println("Enter a number");
        int n= Integer.parseInt(in.readLine());
        String x="";
        char ch;
        
        do
        {
            System.out.println(n--);
            System.out.println("Do you wish to continue");
            ch = in.readLine().charAt(0);           
        }while(ch=='y' || ch=='Y');
        System.out.println("Bye");
    }
}
