package Arrays;
import java.io.*;
public class Student_PhoneNo
{
    static void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        String st[]= new String[10];
        long ph[]=new long[10];        
        String ns="";
        int m=0;
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter student's name");
            st[i]=in.readLine();
            System.out.println("Enter his/her phone number");
            ph[i]=Integer.parseInt(in.readLine());
        }
        
        System.out.println("Student"+"\t"+"Phone Number");
        for(int i=0;i<10;i++)
        {
            System.out.println(st[i]+"\t"+ph[i]);            
        }
        
        System.out.println("Enter the student's name to be searched");
        ns=in.readLine();
        
        int lb=0,ub=9,mid=0,k=0;
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
            else
            {
                k=1;
                m=mid;
                break;
            }
        }  
        if(k==1)
        {
            System.out.println(ns+"'s phone number is "+ph[m]);
        }
        else
        {
            System.out.println("Search Unsuccessful");
        }
    }
}
