package Strings;
import java.util.*;
public class ASCII_Sum
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word");
        String s=sc.next();
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            int x=(int)ch;
            sum+=x;
        }
        System.out.println("The sum of ASCII values of all characters is = "+sum );
    }
}
