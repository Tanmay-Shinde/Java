package PracticalQuestions;
import java.util.*;

public class DateValidity
{
    Scanner sc=new Scanner(System.in);
    int d,m,y;
    int nd;
    void input()
    {
        System.out.println("Please enter a date");
        System.out.print("dd: ");d=sc.nextInt();
        System.out.print("mm: ");m=sc.nextInt();
        System.out.print("yyyy: ");y=sc.nextInt();
    }

    boolean validity()
    {
        if(y==2021)
        {
            if(m==1)
            {
                if(d>0 && d<=31)
                    return true;
                else
                    return false;
            }
            else if(m==2)
            {
                if(d>0 && d<=28)
                    return true;
                else
                    return false;
            }
            else if(m==3)
            {
                if(d>0 && d<=25)
                    return true;
                else
                    return false;
            }
            else
                return false;
        }
        else if(y<2021)
        {
            if(y%4==0)
            {
                if(m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12)
                {
                    if(d>0 && d<=31)
                        return true;
                    else
                        return false;
                }
                else if(m==2)
                {
                    if(d>0 && d<=29)
                        return true;
                    else
                        return false;
                }
                else if(m==4 || m==6 || m==9 || m==11)
                {
                    if(d>0 && d<=30)
                        return true;
                    else
                        return false;
                }
                else
                    return false;
            }
            else
            {
                if(m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12)
                {
                    if(d>0 && d<=31)
                        return true;
                    else
                        return false;
                }
                else if(m==2)
                {
                    if(d>0 && d<=28)
                        return true;
                    else
                        return false;
                }
                else if(m==4 || m==6 || m==9 || m==11)
                {
                    if(d>0 && d<=30)
                        return true;
                    else
                        return false;
                }
                else
                    return false;
            }
        }
        else
        {
            return false;
        }
    }

    void compute()
    {
        if(y%4==0)
        {
            switch(m)
            {
                case 1:
                nd=d;
                break;
                
                case 2:
                nd=31+d;
                break;
                
                case 3:
                nd=31+29+d;
                break;
                
                case 4:
                nd=31+28+31+d;
                break;
                
                case 5:
                nd=31+28+31+30+d;
                break;
                
                case 6:
                nd=31+28+31+30+31+d;
                break;
                
                case 7:
                nd=31+28+31+30+31+30+d;
                break;
                
                case 8:
                nd=31+28+31+30+31+30+31+d;
                break;
                
                case 9:
                nd=31+28+31+30+31+30+31+31+d;
                break;
                
                case 10:
                nd=31+28+31+30+31+30+31+31+30+d;
                break;
                
                case 11:
                nd=31+28+31+30+31+30+31+31+30+31+d;
                break;
                
                case 12:
                nd=31+28+31+30+31+30+31+31+30+31+30+d;
                break;
            }
        }
        else
        {
            switch(m)
            {
                case 1:
                nd=d;
                break;
                
                case 2:
                nd=31+d;
                break;
                
                case 3:
                nd=31+28+d;
                break;
                
                case 4:
                nd=31+28+31+d;
                break;
                
                case 5:
                nd=31+28+31+30+d;
                break;
                
                case 6:
                nd=31+28+31+30+31+d;
                break;
                
                case 7:
                nd=31+28+31+30+31+30+d;
                break;
                
                case 8:
                nd=31+28+31+30+31+30+31+d;
                break;
                
                case 9:
                nd=31+28+31+30+31+30+31+31+d;
                break;
                
                case 10:
                nd=31+28+31+30+31+30+31+31+30+d;
                break;
                
                case 11:
                nd=31+28+31+30+31+30+31+31+30+31+d;
                break;
                
                case 12:
                nd=31+28+31+30+31+30+31+31+30+31+30+d;
                break;
            }
        }
    }

    void display()
    {
        boolean res=validity();
        if(res)
        {
            System.out.println("VALID DATE");
            compute();
            System.out.println(nd);
        }
        else
        {
            System.out.println("INVALID DATE");
        }
    }

    static void main()
    {
        DateValidity ob=new DateValidity();
        ob.input();
        ob.display();
    }
}
