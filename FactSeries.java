package Loops.Loops_For.Nested_For;
import java.util.*;
public class FactSeries
{
    static void main()
    {
        Scanner sc = new Scanner(System.in);
        
        double s=0;
        int f=1;
        for(int i=1;i<=10;i++)
        {
            for(int j=1;j<=i;j++)
            {
                f*=i;
            }
            s=s+1.0/f;
            f=1;
        }
        System.out.println("Sum of series = "+s);
    }
}

