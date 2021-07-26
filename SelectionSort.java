package Arrays;
import java.util.*;
public class SelectionSort
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];//Declaration of array
        int min=0,t=0;;
        
        System.out.println("Enter the numbers");
        for(int i=0;i<10;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<10;i++)
        {
            min=i;
            for(int j=i+1;j<9;j++)
            {
                if(a[j]<a[min])                
                {
                    min=j;
                }
            }
            t=a[min];
            a[min]=a[i];
            a[i]=t;
        }
        System.out.println("The sorted array is:");
        for(int i=0;i<10;i++)
        {
            System.out.println(a[i]);
        }
    }
}
