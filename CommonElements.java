package Functions;
import java.util.*;
public class CommonElements
{
    void getCommon(int m[],int n[])
    {        
        int l=m.length;
        int k=0;
        int s[]=new int[l];
        for(int i=0;i<l;i++)
        {
            int x=m[i];
            boolean flag=false;
            for(int j=0;j<l;j++)
            {
                if(x==n[j])
                {
                    flag=true;
                }
            }
            if(flag==true)
            {
                s[k]=x;
                k++;
            }
        }
        
        System.out.println("The common elements of the 2 arrays are:");
        for(int i=0;i<k;i++)
        {
            System.out.print(s[i]+", ");
        }
    }
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the 2 arrays");
        n=sc.nextInt();
        
        int a[]=new int[n];
        int b[]=new int[n];
        
        System.out.println("Enter the elements of the first array");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the elements of the second array");
        for(int i=0;i<n;i++)
        {
            b[i]=sc.nextInt();
        }
        
        getCommon(a,b);
    }
}
