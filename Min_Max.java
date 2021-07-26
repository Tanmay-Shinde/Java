package Arrays;
import java.util.*;
public class Min_Max
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];

        System.out.println("Enter the numbers");
        for(int i=0;i<10;i++)
        {
            a[i]=sc.nextInt();
        }
        int min=a[0],max=a[0];

        for(int i=0;i<10;i++)
        {
            if(a[i]>max)
            max=a[i];
            if(a[i]<min)
            min=a[i];
        }
        System.out.print("The largest number is "+max);
        System.out.print("The smallest number is "+min);
    }
}
