package Functions;
import java.io.*;
public class MethodCall1
{
    /* method/function definition
     * the program code written within the braces of the method
     */
    static void area()throws IOException  //called method
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in =new BufferedReader(read);
        
        System.out.println("Please enter the value of side of the square.");
        int s=Integer.parseInt(in.readLine());
        int ar=s*s;
        System.out.println("Area of the square = "+ar);
    }
    static void main()throws IOException  //calling method
    {
        area(); //method call statement
        System.out.println("Thank You. Bye.");
    }
    /*main() - it is called the "DRIVER METHOD"
     * This is because all other methods are called from main()
     * Program execution happens from main()
     */
}
