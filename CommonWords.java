package PracticalQuestions;
import java.util.*;
public class CommonWords
{
    Scanner sc=new Scanner(System.in);
    String s;
    int l;
    String st1[];
    String st2[];
    
    CommonWords()
    {
        st1 = new String[2];
    }

    void input()
    {
        while(true)
        {
            System.out.println("Enter TWO sentences in UPPERCASE");
            s = sc.nextLine();
            s=s.toUpperCase();
            l=s.length();
            int k=0;
            for(int i=0;i<l;i++)
            {
                char ch=s.charAt(i);
                if(ch == '.' ||ch == '?' ||ch == '!')
                {
                    k++;
                }
            }
            if(k==2)
            {
                toArray();
                break;
            }
            else
            {
                System.out.println("INVALID INPUT");
            }
        }
    }

    void toArray()
    {
        String s1,s2;
        char ch;
        for(int i=0;i<l;i++)
        {
            ch = s.charAt(i);
            if(ch != '.' ||ch != '?' ||ch != '!')
            {
                s1 = s.substring(0,i);
                s2 = s.substring(i+1,l);
            }
        }
        
    }
    
    static void main()
    {
        CommonWords ob = new CommonWords();
        ob.input();
    }
}
