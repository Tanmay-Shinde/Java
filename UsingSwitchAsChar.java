import java.util.*;
public class UsingSwitchAsChar
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("a. Add");
        System.out.println("b. Subtract");
        System.out.println("c. Multiply");
        System.out.println("d. Divide");
        System.out.println("e. Remainder");
        System.out.println("Please enter your choice");
        char ch=sc.next().charAt(0);
        
        switch(ch)
        {
            case'a':
            case'A':
            System.out.println("Enter the two numbers");
            a=sc.nextInt();
            b=sc.nextInt();
            System.out.println("Sum = "+(a+b));
            break;
            
            case'b':
            case'B':
            System.out.println("Enter the two numbers");
            a=sc.nextInt();
            b=sc.nextInt();
            System.out.println("Difference = "+(a-b));
            break;
            
            case'c':
            case'C':
            System.out.println("Enter the two numbers");
            a=sc.nextInt();
            b=sc.nextInt();
            System.out.println("Product = "+(a*b));
            break;
            
            case'd':
            case'D':
            System.out.println("Enter the two numbers");
            a=sc.nextInt();
            b=sc.nextInt();
            System.out.println("Qoutient = "+(a/b));
            break;
            
            case'e':
            case'E':
            System.out.println("Enter the two numbers");
            a=sc.nextInt();
            b=sc.nextInt();
            System.out.println("Remainder = "+(a%b));
            break;
            
            default:
            System.out.println("Invalid input");
        }
        System.out.println("Thank You!");
    }
}
