package Class_UDD;
import java.util.*;
public class MyArray
{
    int arr[]=new int[10];
    void inputArray()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 numbers in the array in the ascending order");
        for(int i=0;i<10;i++)
        {
            arr[i]=sc.nextInt();
        }
    }
    void binarySearch(int val)
    {        
        int lb,ub,mid=0,k=0;

        ub=10;
        lb=0;

        while(lb!=ub)
        {
            mid=(lb+ub)/2;
            if(arr[mid]<val)
            {
                lb=mid+1;
            }
            else if(arr[mid]>val)
            {
                ub=mid-1;
            }
            else if(arr[mid]==val)
            {
                k=1;
                break;
            }
        }  
        if(k==1)
        {
            System.out.println("Number found");
        }
        else
        {
            System.out.println("Number not found");
        }
    }
    void main()
    {
        Scanner sc=new Scanner(System.in);
        MyArray ob = new MyArray();
        
        ob.inputArray();
        System.out.println("Enter number to be searched");
        int x=sc.nextInt();
        ob.binarySearch(x);
    }
}
