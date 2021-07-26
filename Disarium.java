package Loops.Loops_While;
import java.util.*;
public class Disarium
{
    static void main()
    {
        Scanner sc= new Scanner(System.in);
        int n,t=0,t2=0,d=0;
        double sum=0.0d;
        
        System.out.println("Enter a number");
        n=sc.nextInt();
        
        t=n;
        while(t!=0)
        {
            int a=t%10;
            d++;
            t=t/10;
        }
        
        t2=n;
        while(t2!=0)
        {
            int a=t2%10;
            sum = sum + Math.pow(a,d--);
            t2=t2/10;
        }
        
        if(n==(int)sum)
        {
            System.out.println("Disarium");
        }
        else
        {
            System.out.println("Not Disarium");
        }
    }
}
