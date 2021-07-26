package StringTokenizer;
import java.io.*;
import java.util.*;
public class TokenizerExample1
{
    String str;
    String arr[];
    StringTokenizer s;

    void input()throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a sentence");
        str = in.readLine();
    }
    void StoreinArray()
    {
        s=new StringTokenizer(str);
        int numberOfTokens = s.countTokens();
        arr = new String[numberOfTokens];
        for(int i=0;i<arr.length;i++)
        {
            String st=s.nextToken();
            arr[i]=st;
        }
    }
    void display()
    {
        System.out.println("The words stored in the array are:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    static void main()throws IOException
    {
        TokenizerExample1 ob = new TokenizerExample1();
        ob.input();
        ob.StoreinArray();
        ob.display();
    }
}
