import java.util.*;
public class HotelStay
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        String n;
        int d,bill=0;
        
        System.out.println("Enter your name");
        n=sc.next();
        System.out.println("Enter the no. of days");
        d=sc.nextInt();
        
        if(d>=0 && d<=3)
        {
            bill=d*350;
        }
        else if(d>3 && d<=6)
        {
            bill=3*350 + (d-3)*300;
        }
        else if(d>6 && d<=9)
        {
            bill=3*350 + 3*300 + (d-6)*275;
        }
        else if(d>9)
        {
            bill=3*350 + 3*300 + 3*275 + (d-9)*225;
        }
        else
        {
            System.out.println("Invalid Input");
            System.exit(0);
        }
        System.out.println("Name\t\tNo of Days\tRoom no \t Bill Amount");
        System.out.println(n+"\t\t"+d+"\t\t703\t\t"+bill);
    }
}
