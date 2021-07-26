package Functions;
import java.io.*;
public class PrimeRange
{
    void displayPrime(int x,int y)
    {
        System.out.println("The prime numbers between "+x+" and "+y+" are:");
        for(int i=x;i<=y;i++)
        {
            int k=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    k++;
                }
            }
            if(k==2)
            {
                System.out.println(i);
            }
        }
    }
    void main()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        System.out.println("Enter the lower and the upper limit of the range");;
        int a=Integer.parseInt(in.readLine());
        int b=Integer.parseInt(in.readLine());
        
        displayPrime(a,b);
    }
}
