package PracticalQuestions;
import java.util.*;
public class NumberToWords
{
    Scanner sc=new Scanner(System.in);
    int n;
    String ns="";
    int k=1;
    
    void input()
    {
        System.out.println("Please enter a number between 0 & 1000");
        n=sc.nextInt();
    }
    void convert()
    {
        int t=n;
        int a=0;
        while(t!=0)
        {
            a=t%10;
            if(k==1)
            {
                if(a==1)
                    ns=" ONE";
                else if(a==2)
                    ns=" TWO";
                else if(a==3)
                    ns=" THREE";
                else if(a==4)
                    ns=" FOUR";
                else if(a==5)
                    ns=" FIVE";
                else if(a==6)
                    ns=" SIX";
                else if(a==7)
                    ns=" SEVEN";
                else if(a==8)
                    ns=" EIGHT";
                else if(a==2)
                    ns=" NINE";
            }
            else if(k==2)
            {
                if(a==1)
                {
                    if(ns.equals(" ONE"))
                        ns=" ELEVEN";
                    else if(ns.equals(" TWO"))
                        ns=" TWELVE";
                    else if(ns.equals(" THREE"))
                        ns=" THIRTEEN";
                    else if(ns.equals(" FOUR"))
                        ns=" FOURTEEN";
                    else if(ns.equals(" FIVE"))
                        ns=" FIFTEEN";
                    else if(ns.equals(" SIX"))
                        ns=" SIXTEEN";
                    else if(ns.equals(" SEVEN"))
                        ns=" SEVENTEEN";
                    else if(ns.equals(" EIGHT"))
                        ns=" EIGHTEEN";
                    else if(ns.equals(" NINE"))
                        ns=" NINETEEN";
                }
                else if(a==2)
                    ns=" TWENTY"+ns;
                else if(a==3)
                    ns=" THIRTY"+ns;
                else if(a==4)
                    ns=" FORTY"+ns;
                else if(a==5)
                    ns=" FIFTY"+ns;
                else if(a==6)
                    ns=" SIXTY"+ns;
                else if(a==7)
                    ns=" SEVENTY"+ns;
                else if(a==8)
                    ns=" EIGHTY"+ns;
                else if(a==2)
                    ns=" NINETY"+ns;
            }
            else if(k==3)
            {
                if(a==1)
                    ns=" ONE HUNDRED AND"+ns;
                else if(a==2)
                    ns=" TWO HUNDRED AND"+ns;
                else if(a==3)
                    ns=" THREE HUNDRED AND"+ns;
                else if(a==4)
                    ns=" FOUR HUNDRED AND"+ns;
                else if(a==5)
                    ns=" FIVE HUNDRED AND"+ns;
                else if(a==6)
                    ns=" SIX HUNDRED AND"+ns;
                else if(a==7)
                    ns=" SEVEN HUNDRED AND"+ns;
                else if(a==8)
                    ns=" EIGHT HUNDRED AND"+ns;
                else if(a==2)
                    ns=" NINE HUNDRED AND"+ns;
            }
            t=t/10;
            k++;
        }
    }
    void display()
    {
        if(ns.endsWith("AND"))
        {
            int l=ns.length();
            int s=l-3;
            System.out.println(ns.substring(0,s).trim());
        }
        else
            System.out.println(ns.trim());
    }
    static void main()
    {
        NumberToWords ob=new NumberToWords();
        ob.input();
        if(ob.n>0 && ob.n<1000)
        {
            ob.convert();
            ob.display();
        }
        else
        {
            System.out.println("OUT OF RANGE");
        }
    }
}
