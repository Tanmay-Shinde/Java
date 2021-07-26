package Arrays;
import java.util.*;
public class Palindrome
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];//Declaration of array

        System.out.println("Enter the numbers");
        for(int i=0;i<10;i++)
        {
            a[i]=sc.nextInt();
        }

        for(int i=0;i<10;i++)
        {
            int t=a[i];
            int rev=0;

            while(t!=0)
            {
                int r=t%10;
                rev = rev*10+r;
                t=t/10;
            }
            if(a[i]==rev)
            {
                System.out.println(a[i]);
            }
        }
    }
}
