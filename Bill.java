package Class_UDD;
import java.util.*;
public class Bill
{
    String name;
    int units;
    double total;

    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        name=sc.nextLine();
        System.out.println("Enter the number of units consumed");
        units =sc.nextInt();
    }

    void calc()
    {
        if(units>0 && units<=170)
        {
            total=200+(0.5*units);
        }
        else if(units>170 && units<=250)
        {
            total=200+(0.5*170)+(0.75*(units-170));
        }
        else if(units>250 && units<=350)
        {
            total=200+(0.5*170)+(0.75*80)+(1*(units-250));
        }
        else if(units>350)
        {
            total=200+(0.5*170)+(0.75*80)+(1*100)+(1.35*(units-350));
        }
        else
        {
            System.out.println("Invalid Input");
        }
    }

    void display()
    {
        System.out.println("Name \t No. of Units \t Bill Amount");
        System.out.println(name+"\t\t"+units+"\t\t"+total);
    }

    void main()
    {
        Bill ob=new Bill();
        int j=1;
        for(int i=1;i<=10;i++)
        {
            System.out.println("Data for Consumer "+(j++));
            ob.accept();
            ob.calc();
            ob.display();
            System.out.println();
        }
    }
}
