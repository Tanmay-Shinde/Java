package Arrays;
import java.util.*;
public class AcceptArray
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];//Declaration of array

        System.out.println("Enter the numbers");
        for(int i=0;i<10;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.println("The elements of the array are:");
        for(int i=0;i<10;i++)
        {
            System.out.println(a[i]+" ");
        }
    }
}
