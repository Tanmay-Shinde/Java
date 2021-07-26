package Functions;
import java.util.*;
public class Overload_CalcAvg
{
    float calcAvg(int a,int b)
    {
        int s=a+b;
        float avg=s/2;
        return avg;
    }
    int calcAvg(int a)
    {
        return a;
    }
    float calcAvg(byte size)
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[size];
        int s=0;
        System.out.println("Enter the elements of the array");
        for(int i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++)
        {
            s=s+a[i];
        }
        float avg=s/size;
        
        return avg;
    }
    void main()
    {
        Scanner sc=new Scanner(System.in);
        float a = calcAvg(7,14);
        System.out.println("Average of 7 & 14 is = "+a);
        int b=calcAvg(79);
        System.out.println("The passed & the returned number is = "+b);
        byte s;
        System.out.println("Enter size of the array");
        s=sc.nextByte();
        float c=calcAvg(s);
        System.out.println("Average of the array = "+c);
    }
}
