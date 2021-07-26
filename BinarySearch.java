package Arrays;
import java.util.*;
public class BinarySearch
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        int m[]={1,2,3,4,5,6,7,8,9,24};
        int lb,ub,mid=0,ns,k=0;

        ub=m.length-1;
        lb=0;

        System.out.println("Enter the element to be searched");
        ns=sc.nextInt();

        while(lb!=ub)
        {
            mid=(lb+ub)/2;
            if(m[mid]<ns)
            {
                lb=mid+1;
            }
            else if(m[mid]>ns)
            {
                ub=mid-1;
            }
            else if(m[mid]==ns)
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
            System.out.println("Search Unsuccessful");
        }
    }
}
