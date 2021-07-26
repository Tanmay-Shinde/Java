package Arrays;
import java.util.*;
public class StoringWord
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        String w="";
        String ch1="";
        System.out.println("Enter the word");
        w=sc.next();
        int l=w.length();
        String []a=new String[l];
        for(int i=0;i<w.length();i++)
        {
            char ch=w.charAt(i);
            ch1=ch1+ch;
            a[i]=ch1;
            ch1="";
        }

        System.out.println("The elements of the array are:");
        for(int i=0;i<l;i++)
        {
            System.out.println(a[i]);
        }
    }
}
