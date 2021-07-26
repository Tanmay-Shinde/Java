package Loops.Loops_For;
import java.util.*;
public class RandomSum
{
    void main()
    {
        Scanner sc = new Scanner(System.in);
        int n,s=0;
        
        System.out.println("Enter any 10 numbers");
        for(int i=0;i<=10;i++)
        {
            n=sc.nextInt();
            s+=n;
        }
        System.out.println("Sum of ten numbers entered is = "+s
        );
    }
}
