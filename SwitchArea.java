import java.io.*;
public class SwitchArea
{
    void main()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        
        System.out.println("1. Area of Circle");
        System.out.println("2. Area of Rectangle");
        System.out.println("3. Area of Square");
        System.out.println("Please enter your choice");
        int ch=Integer.parseInt(in.readLine());
        
        switch(ch)
        {
            case 1:
            System.out.println("Enter value for radius");
            int r=Integer.parseInt(in.readLine());
            double area=3.14*r*r;
            System.out.println("Area of the circle = "+ area);
            break;
            
            case 2:
            System.out.println("Enter value of length & breadth");
            int l=Integer.parseInt(in.readLine());
            int b=Integer.parseInt(in.readLine());
            int ar=l*b;
            System.out.println("Area of the Rectangle = "+ ar);
            break;
            
            case 3:
            System.out.println("Enter value of side of square");
            int s=Integer.parseInt(in.readLine());
            int a=s*s;
            System.out.println("Area of the square = "+ a);
            break;
            
            default:
            System.out.println("Invalid value entered");
        }
        System.out.println("Thank You");
    }
}
