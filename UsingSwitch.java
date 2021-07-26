import java.io.*;
public class UsingSwitch
{
    void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Remainder");
        System.out.println("Please enter your choice");
        int ch= Integer.parseInt(in.readLine());
        double a,b;
        
        switch(ch)
        {
            case 1:
            System.out.println("Enter two numbers");
            a=Double.parseDouble(in.readLine());
            b=Double.parseDouble(in.readLine());
            System.out.println("Sum = "+(a+b));
            break;
            
            case 2:
            System.out.println("Enter two numbers");
            a=Double.parseDouble(in.readLine());
            b=Double.parseDouble(in.readLine());
            System.out.println("Difference = "+(a-b));
            break;
            
            case 3:
            System.out.println("Enter two numbers");
            a=Double.parseDouble(in.readLine());
            b=Double.parseDouble(in.readLine());
            System.out.println("Product = "+(a*b));
            break;
            
            case 4:
            System.out.println("Enter two numbers");
            a=Double.parseDouble(in.readLine());
            b=Double.parseDouble(in.readLine());
            System.out.println("Quotient = "+(a/b));
            break;
            
            case 5:
            System.out.println("Enter two numbers");
            a=Double.parseDouble(in.readLine());
            b=Double.parseDouble(in.readLine());
            System.out.println("Remainder= "+(a%b));
            break;
            
            default:
            System.out.println("Invalid Input");
        }
        System.out.println("Thank You");
    }
}
