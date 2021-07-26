package String_Buffer;
import java.io.*;
public class Encryption
{
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String arr[];
    int n;
    void input()throws IOException
    {
        while(true)
        {
            System.out.println("Enter the size of array:");
            n=Integer.parseInt(in.readLine());
            if(n>1 && n<10)
            {
                break;
            }
            else
            {
                System.out.println("The size of the array can only be between 1 and 10");
            }
        }
        arr = new String[n];
        System.out.println("Enter "+n+" sentences");
        for(int i=0;i<n;i++)
        {
            arr[i]=in.readLine();
        }
    }
    void Encryption()
    {
        String s="";
        String ns="";
        for(int i=0;i<arr.length;i++)
        {
            s=arr[i];
            if(i%2 == 0)
            {
                int l=s.length();
                for(int j=0;j<l;j++)
                {
                    char ch=s.charAt(j);
                    if(ch != ' ')
                        ns = ns + (char)(ch+2);
                    else
                        ns = ns+" ";
                }
                arr[i]=ns;
                ns="";
            }
            else
            {
                s=s+" ";
                int l=s.length();
                String ns2="";
                for(int j=0;j<l;j++)
                {
                    char ch=s.charAt(j);
                    if(ch != ' ')
                    {
                        ns2=ns2+ch;
                    }
                    else
                    {
                        ns = ns2 +" "+ ns;
                        ns2="";
                    }
                }
                arr[i]=ns;
                ns2="";
                ns="";
            }
        }
    }
    void display()
    {
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
    static void main()throws IOException
    {
        Encryption ob = new Encryption();
        ob.input();
        ob.Encryption();
        ob.display();
    }
}
