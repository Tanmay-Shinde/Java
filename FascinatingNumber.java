package PracticalQuestions;
import java.util.*;
public class FascinatingNumber
{
    Scanner sc = new Scanner(System.in);
    int n1;
    String s1, s2, s3, s4;
    char arr[];
    FascinatingNumber()
    {
        s1="";
        s2="";
        s3="";
        s4="";
    }
    
    void input()
    {
        System.out.println("Enter a number");
        n1=sc.nextInt();
    }

    void newNumber()
    {
        int n2 = n1*2;
        int n3 = n1*3;
        s1 = ""+n1;
        s2 = ""+n2;
        s3 = ""+n3;
        s4 = "123456789";
    }

    void toArray()
    {
        int l=s4.length();
        arr = new char[l];
        char ch;
        for(int i=0;i<l;i++)
        {
            arr[i] = s4.charAt(i);
        }
    }

    int count()
    {
        int s=0;
        for(int i=1;i<=9;i++)
        {
            int k=0;
            for(int j=0;j<arr.length;j++)
            {
                int c = (int)(arr[j]);
                if(c == i)
                {
                    k++;
                }
            }
            if(k==0 || k>1)
            {
                break;
            }
            s++;
        }
        return s;
    }
    
    void display()
    {
        int c = count();
        if(c == 9)
        {
            System.out.println(n1 + " is a fascinating number");
        }
        else
        {
            System.out.println(n1 + " is not a fascinating number");
        }
    }
    
    static void main()
    {
        FascinatingNumber ob = new FascinatingNumber();
        ob.input();
        ob.newNumber();
        ob.toArray();
        ob.display();
    }
}
