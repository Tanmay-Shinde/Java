import java.util.*;
public class CabService
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        String n;
        int d,bill=0;
        
        System.out.println("Enter your name");
        n=sc.nextLine();
        System.out.println("Enter distance travelled");
        d=sc.nextInt();
        
        if(d>=0 && d<=1)
        {
            bill=25*d;
        }
        else if(d>1 && d<=5)
        {
            bill=25*1 + (d-1)*30;
        }
        else if(d>5 && d<=15)
        {
            bill=25*1 + 4*30 + (d-5)*45;
        }
        else if(d>15)
        {
            bill=25*1 + 4*30 + 10*45 + (d-15)*50;
        }
        else
        {
            System.out.println("Invalid Input");
            System.exit(0);
        }
        System.out.println("NAME OF CUSTOMER\t\tNO OF KMS\t\tBILL AMOUNT");
        System.out.println(n+"\t\t"+d+"\t\t"+bill);
    }
}
