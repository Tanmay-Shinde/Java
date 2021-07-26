package Strings;
import java.util.*;
public class CharExtraction
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();
        
        System.out.println("The characters are:");
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            System.out.println(ch);
        }
    }
}
