import java.util.*;
public class InternetBill
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your name");
        String n=sc.next();
        System.out.println("Please enter number of hours");
        int h=sc.nextInt();
        int bill=0;
        
        if(h>=0 && h<=30)
        {
            bill=h*10;
        }
        else if(h>30 && h<=40)
        {
            bill= 30*10 + (h-30)*8;
        }
        else if(h>40 && h<=50)
        {
            bill= 30*10 + 10*8 + (h-30)*6;
        }
        else if(h>50)
        {
            bill= 30*10 + 10*8 + 10*6 + (h-30)*5;
        }
        else
        {
            System.out.println("Invalid input");            
        }
        System.out.println("Name of user\t\tNo. of hours\t\tBill Amount");
        System.out.println(n+"\t\t"+h+"\t\t"+bill);
    }
}
