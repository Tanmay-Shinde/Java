package Arrays;
import java.util.*;
public class SumOfElements
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];//Declaration of array
        int s=0;

        System.out.println("Enter the numbers");
        for(int i=0;i<10;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.print("The sum of all elements is:");
        for(int i=0;i<10;i++)
        {
            s=s+a[i];
        }
        System.out.print("The sum of all elements is:");
    }
}
