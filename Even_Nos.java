package Arrays;
import java.util.*;
public class Even_Nos
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        int a[] = new int[10];

        System.out.println("Enter the numbers");
        for(int i=0;i<10;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.println("The Even numbers are:");
        for(int i=0;i<10;i++)
        {
            if(a[i]%2==0 && a[i]!=0)
            {
                System.out.println(a[i]);
            }
        }
    }
}
