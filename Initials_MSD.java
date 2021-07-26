package Strings;
import java.util.*;
public class Initials_MSD
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();
        s=s.toUpperCase();
        s=" "+s;
        String n="";
        
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch==' ')
            {
                n=n+s.charAt(i+1);
            }
        }
        System.out.println("The Initials are: "+n);
    }
}
