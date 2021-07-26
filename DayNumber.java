package PracticalQuestions;
import java.util.*;
public class DayNumber
{
    Scanner sc=new Scanner(System.in);
    int dn;
    int y;
    int n;
    String date;
    int a[]={1,2,3,4,5,6,7,8,9,10,11,12};
    String arr[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
    int a2[]={0,31,59,90,120,151,181,212,243,273,304,334};
    void input()
    {
        System.out.print("DAY NUMBER:     ");
        dn=sc.nextInt();
        System.out.print("YEAR:     ");
        y=sc.nextInt();
        System.out.print("DATE AFTER 'N' DAYS:     ");
        n=sc.nextInt();
    }

    boolean check1()
    {
        if(y%4==0)
        {
            if(dn>0 && dn<=366)
                return true;
            else
                return false;
        }
        else
        {
            if(dn>0 && dn<=365)
                return true;
            else
                return false;
        }
    }

    boolean check2()
    {
        if(n>0 && n<=100)
            return true;
        else
            return false;
    }

    void calcDate()
    {
        date = " " + y;
        if(y%4!=0)
        {
            double t = dn/365.0;
            int m = (int)(t*12);
            date = arr[m] + "," + date;
            int day = dn - a2[m];
            if(day==1 || day==21 || day==31)
            {
                date = day+ "st " + date;
            }
            else if(day==2 || day==22)
            {
                date = day+ "nd " + date;
            }
            else if(day==3 || day==23)
            {
                date = day+ "rd " + date;
            }
            else
            {
                date = day+ "th " + date;
            }
            System.out.println(date);
        }
    }

    public static void main()
    {
        DayNumber ob = new DayNumber();
        ob.input();
        boolean k1 = ob.check1();
        if(k1)
        {
            boolean k2 = ob.check2();
            if(k2)
            {
                ob.calcDate();
            }
            else
            {
                System.out.println("N OUT OF RANGE!");
            }
        }
        else
        {
            System.out.println("DAY NUMBER OUT OF RANGE!");
        }
    }
}
