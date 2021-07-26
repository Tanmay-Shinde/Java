package Arrays;
import java.util.*;
public class Name_BeginWithA
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        String n[]= new String[10];
        char ch;
        System.out.println("Enter the names");
        for(int i=0;i<10;i++)
        {
            n[i]=sc.next();
        }
        
        for(int i=0;i<10;i++)
        {
            ch=n[i].charAt(0);
            if(ch=='a'||ch=='A')
            {
                System.out.println(n[i]);
            }
        }
    }
}
