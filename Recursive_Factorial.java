import java.util.*;
public class Recursive_Factorial
{
    static int f=1;
    static void rec_factorial(int i)
    {
        if(i!=0)
        {
            f = f*i;
            rec_factorial(--i);
        }
    }
    static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        rec_factorial(sc.nextInt());
        System.out.print("It's factorial is: "+f);
    }    
}
