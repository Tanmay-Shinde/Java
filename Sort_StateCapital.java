package Arrays;
import java.io.*;
public class Sort_StateCapital
{
    static void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        
        String st[]= new String[10];
        String Cap[]=new String[10];
        String t="",tc="";
        
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter the state");
            st[i]=in.readLine();
            System.out.println("Enter the capital");
            Cap[i]=in.readLine();
        }
        System.out.println("State"+"\t"+"Capital");
        for(int i=0;i<10;i++)
        {
            System.out.println(st[i]+"\t"+Cap[i]);            
        }
        
        for(int i=0;i<9;i++)
        {
            for(int j=1;j<9-i;j++)
            {
                if(st[j].compareTo(st[j+1])>0)             
                {
                    t=st[j];
                    st[j]=st[j+1];
                    st[j+1]=t;
                    
                    tc=Cap[j];
                    Cap[j]=Cap[j+1];
                    Cap[j+1]=tc;
                }
            }
        }
        
        System.out.println("The sorted array is:");
        for(int i=0;i<10;i++)
        {
            System.out.println(st[i]+"\t"+Cap[i]);            
        }
    }
}
