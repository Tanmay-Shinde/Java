package Functions;
import java.io.*;
public class PassByValue //passing values from driver method to other methods
{
    /* Pass by value - Passing of primitive datatypes(including String)
     *               - Changes made on formal para. are not reflected on actual parameters
     * Pass by reference - Passing of non-primitive datatypes (eg- arrays)
     *                   - Here only the reference/address of the value is shared hence changes made in the formal parameters are reflected on the actual parameters    
     */                
    static void area(int s)throws IOException //called method
    {               //int s received by the called method is a formal parameter
        int ar=s*s;
        s=(int)Math.pow(s,3);
        
        System.out.println("Area of the square = "+ar);
        System.out.println("Value of the argument passed in called method = "+s);
    }
    static void main()throws IOException //calling method
    {        
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in =new BufferedReader(read);
        
        System.out.println("Please enter the value of side of the square.");
        int s=Integer.parseInt(in.readLine());
        area(s); //int s passed from the calling method is the actual parameter 
        System.out.println("Value of the argument passed in calling method = "+s);
    }
}
