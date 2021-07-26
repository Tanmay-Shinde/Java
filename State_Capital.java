package Arrays;
import java.util.*;
public class State_Capital
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        String st[]= new String[10];
        String Cap[]=new String[10];
        int lb=0,ub=9,mid=0,k=0;
        String ns="";
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter the state");
            st[i]=sc.nextLine();
            System.out.println("Enter the capital");
            Cap[i]=sc.nextLine();
        }
        System.out.println("State"+"\t"+"Capital");
        for(int i=0;i<5;i++)
        {
            System.out.println(st[i]+"\t"+Cap[i]);            
        }
        
        System.out.println("Enter the state to be searched");
        ns=sc.nextLine();

        while(lb!=ub)
        {
            mid=(lb+ub)/2;
            if(st[mid].compareTo(ns)<0)
            {
                lb=mid+1;
            }
            else if(st[mid].compareTo(ns)>0)
            {
                ub=mid-1;
            }
            else if(st[mid].compareTo(ns)==0)
            {
                k=1;
                break;
            }
        }  
        if(k==1)
        {
            System.out.println("The capital of "+ns+" is "+Cap[mid]);
        }
        else
        {
            System.out.println("Search Unsuccessful");
        }
    }
}
