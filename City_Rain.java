package Arrays;
import java.util.*;
public class City_Rain
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        String c[]=new String[10];
        Double r[]=new Double[10];
        double max=0.0;int t=0;
        String ns;

        for(int i=0;i<10;i++)
        {
            System.out.println("Enter the name of the city");
            c[i]=sc.next();
            System.out.println("Enter the amount of rainfall");
            r[i]=sc.nextDouble();
        }

        for(int i=0;i<10;i++)
        {
            if(r[i]>max)
            {
                max=r[i];
                t=i;
            }       
        }

        System.out.println("The city with maximum rainfall is "+c[t]);

    }
}
