package StringTokenizer;
import java.io.*;
import java.util.*;
public class TokenizerExample2
{
    String str;
    String arr[];
    StringTokenizer s;
    
    TokenizerExample2()
    {
        str="";
    }
    void input()throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a sentence separated by commas");
        str = in.readLine();
    }
    int countingTokens(StringTokenizer st)
    {
        int numberoftokens = st.countTokens();
        return numberoftokens;
    }
    void StoreinArray()
    {
        s= new StringTokenizer(str,",");
        int n= countingTokens(s);
        arr = new String[n];        
        while(s.hasMoreTokens())
        {
            System.out.println(s.nextToken());
        }
        s= new StringTokenizer(str,",");
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextToken();
        }
    }
    void display()
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void main()throws IOException
    {
        TokenizerExample2 ob = new TokenizerExample2();
        ob.input();
        ob.StoreinArray();
        ob.display();
    }
}
