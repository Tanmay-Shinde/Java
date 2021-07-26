import java.io.*;
public class percentage
{
    void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        double p,c,b,m,e,per;
        
        System.out.println("Enter your Physics marks");
        p=Double.parseDouble(in.readLine());
        System.out.println("Enter your Chemistry marks");
        c=Double.parseDouble(in.readLine());
        System.out.println("Enter your Biology marks");
        b=Double.parseDouble(in.readLine());
        System.out.println("Enter your Maths marks");
        m=Double.parseDouble(in.readLine());
        System.out.println("Enter your English marks");
        e=Double.parseDouble(in.readLine());
        
        per = (p+c+b+m+e)/5;
        System.out.println("Percentage = "+per);
        if(per>80 && per<=100)
        {
            System.out.println("Your grade is A");
        }
        else if(per>60 && per<=80)
        {
            System.out.println("Your grade is B");
        }
        else if(per>0 && per<=60)
        {
            System.out.println("Your grade is C");
        }
        else
        {
            System.out.println("* Invalid data provided *");
        }
        System.out.println("Thank You");
    }
}
