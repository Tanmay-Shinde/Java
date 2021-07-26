package Functions;
import java.io.*;
public class Perfect_Number
{
    static void isPerfect(int a,int b)
    {
        System.out.println("The perfect numbers are:");
        for(int i=a;i<=b;i++)
        {
            int s=0;
            for(int j=1;j<i;j++)
            {
                if(i%j==0)
                {
                    s+=j;
                }
            }
            if(s==i)
            {
                System.out.println(i);
            }
        }
    }
    static void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        
        System.out.println("This is a program that will display all the perfect numbers within the range");
        System.out.println("Enter lower limit:");
        int a=Integer.parseInt(in.readLine());
        System.out.println("Enter upper limit:");
        int b=Integer.parseInt(in.readLine());
        
        System.out.println();
        
        isPerfect(a,b);
    }
}
