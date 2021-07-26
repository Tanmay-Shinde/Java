package Strings;
import java.util.*;
public class CountVowels
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();
        s=s.toLowerCase();
        int k=0;
        
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                k++;
            }
        }
        System.out.println("Total number of vowels = "+k);
    }
}
