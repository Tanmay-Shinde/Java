package Arrays;
import java.util.*;
public class Pos_Neg
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        int Arr[]=new int[5];
        int p=0,n=0;
        System.out.println("Enter 5 numbers");
        for(int i=0;i<5;i++)
        {
            Arr[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++)
        {
            if(Arr[i]>=0)
            {
                p++;
            }
            else if(Arr[i]<0)
            {
                n++;
            }
        }
        int A[]=new int[p];
        int B[]=new int[n];
        
        p=0;n=0;
        for(int i=0;i<5;i++)
        {
            if(Arr[i]>=0)
            {
                A[p]=Arr[i];
                p++;
            }
            if(Arr[i]<0)
            {
                B[n]=Arr[i];
                n++;
            }
        }

        System.out.println("Positive numbers in the array are:");
        for(int j=0;j<p;j++)
        {
            System.out.println(A[j]);
        }

        System.out.println("Negative numbers in the array are:");
        for(int j=0;j<n;j++)
        {
            System.out.println(B[j]);
        }
    }
}
