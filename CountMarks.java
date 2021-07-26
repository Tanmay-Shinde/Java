
package Arrays;
import java.util.*;
public class CountMarks
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        String n[]=new String[10];//Declaration of array
        int min=0,t=0,ms,k=0;
        
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter the name");
            n[i]=sc.next();
            System.out.println("Enter his/her marks");
            a[i]=sc.nextInt();
        }

        System.out.println("Enter the search marks");
        ms=sc.nextInt();

        for(int i=0;i<10;i++)
        {
            min=i;
            for(int j=i+1;j<9;j++)
            {
                if(a[j]==a[min])                
                {
                    k++;
                }
            }
        }
        
        System.out.println("The search element occurs "+k+" times");
    }
}
