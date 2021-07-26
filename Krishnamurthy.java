package Loops.Loops_For.Nested_For;
import java.util.*;
public class Krishnamurthy   //a.k.a. Special number
{
    static void main()
    {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int t=n;
        int s=0,f=1;
        
        while(t!=0)       
        {
            int a=t%10;
            for(int i=1;i<=a;i++)
            {
                f*=i;
            }
            s+=f;
            t=t/10;
            f=1;
        }
        if(s==n)
        System.out.println(n+" is a Krishnamurthy number");
        else
        System.out.println(n+" is not a Krishnamurthy number");
    }
}
