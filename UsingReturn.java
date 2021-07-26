package Functions;
import java.io.*;
public class UsingReturn
{
    int calcArea(int a)throws IOException
    {
        int ar=a*a;
        System.out.println("Area of square = "+ar);
        return ar;
    }
    void main()throws IOException
    {
        InputStreamReader read =new InputStreamReader(System.in);
        BufferedReader in =new BufferedReader(read);
        
        System.out.println("Enter the value of side");
        int s=Integer.parseInt(in.readLine());
        
        int k=calcArea(s);
        
        System.out.println("Area of square = "+k);
        System.out.println("Area of square = "+calcArea(s));
    }
}
