import java.util.*;
public class Worksheet_1
{
    static void ClothShop()
    {
        Scanner sc= new Scanner(System.in);
        double c, d=0.0d , bill=0.0d;
        
        System.out.println("Enter the total cost of purchase");
        c=sc.nextDouble();
        
        if(c>0 && c<=2000)
        {
            d=0.05*c;
            bill=c-d;
        }
        else if(c>2000 && c<=5000)
        {
            d=0.25*c;
            bill=c-d;
        }
        else if(c>5000 && c<=10000)
        {
            d=0.35*c;
            bill=c-d;
        }
        else if(c>10000)
        {
            d=0.5*c;
            bill=c-d;
        }
        else
        {
            System.out.println("Invalid Input");
        }
        
        System.out.println("Purchase Cost = "+c);
        System.out.println("Discount = "+d);
        System.out.println("Amount payable = "+bill);
        System.out.println("Thank You! Visit Again!");
    }
    
    void CabService()
    {
        Scanner sc=new Scanner(System.in);
        String n;
        int d, amt=0;
        
        System.out.println("Enter name of the customer");
        n=sc.next();
        System.out.println("Enter the distance travelled");
        d=sc.nextInt();
        
        if(d==1)
        {
            amt=1*25;
        }
        else if(d>1 && d<=5)
        {
            amt=25 + (d-1)*20;
        }
        else if(d>5 && d<=15)
        {
            amt=105 + (d-5)*15;
        }
        else if(d>15)
        {
            amt=255 + (d-15)*10;
        }
        else
        {
            System.out.println("Invalid Input");
        }
        
        System.out.println("Name \t\t No. of kms \t\t Amount");
        System.out.println(n+"\t\t"+d+"\t\t"+amt);
    }
}
