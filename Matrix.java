package Class_UDD;
import java.util.*;
public class Matrix
{
    int m[]=new int[10];
    void indata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enterv 10 values in the array");
        for(int i=0;i<10;i++)
        {
            m[i]=sc.nextInt();
        }
    }
    void largest()
    {
        int max=m[0];
        for(int i=1;i<10;i++)
        {
            if(m[i]>max)
            {
                max=m[i];
            }
        }
        System.out.println("Largest Value = "+max);
    }
    void smallest()
    {
        int min=m[0];
        for(int i=1;i<10;i++)
        {
            if(m[i]<min)
            {
                min=m[i];
            }
        }
        System.out.println("Smallest Value = "+min);
    }
    void main()
    {
        Matrix ob=new Matrix();
        ob.indata();
        ob.largest();
        ob.smallest();
    }
}
