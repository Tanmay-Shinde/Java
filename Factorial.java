package Loops.Loops_For;
import java.util.*;
public class Factorial
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter a number");
        int n=sc.nextInt();
        long f=1;
        
        for(int i=1;i<=n;i++)
        f*=i;
        System.out.println("Factorial of "+n+" = "+f);
    }
}
