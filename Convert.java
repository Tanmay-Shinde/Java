package Class_UDD;
import java.util.*;
public class Convert
{
    int n;
    String strWords="";
    void inputNum()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        n=sc.nextInt();
    }

    void extDigit()
    {
        int t=n;
        int a;
        while(t!=0)
        {
            a=t%10;
            digit_to_word(a);
            t=t/10;
        }
    }

    void digit_to_word(int digit)
    {
        
        if(digit==0)
        {
            strWords="Zero "+strWords;
        }
        else if(digit==1)
        {
            strWords="One "+strWords;
        }
        else if(digit==2)
        {
            strWords="Two "+strWords;
        }
        else if(digit==3)
        {
            strWords="Three "+strWords;
        }
        else if(digit==4)
        {
            strWords="Four "+strWords;
        }
        else if(digit==5)
        {
            strWords="Five "+strWords;
        }
        else if(digit==6)
        {
            strWords="Six "+strWords;
        }
        else if(digit==7)
        {
            strWords="Seven "+strWords;
        }
        else if(digit==8)
        {
            strWords="Eight "+strWords;
        }
        else if(digit==9)
        {
            strWords="Nine "+strWords;
        }
    }
    void displayInWords()
    {
        System.out.println("Number entered: "+n);
        System.out.println("Number in words: "+strWords);
    }
    static void main()
    {
        Convert ob=new Convert();
        ob.inputNum();
        ob.extDigit();
        ob.displayInWords();
    }
}
