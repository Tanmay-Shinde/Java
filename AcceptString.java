package Strings;
import java.io.*;
import java.util.*;
public class AcceptString
{
    static void main()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        
        Scanner sc = new Scanner(System.in);
        
        String y="";// Declaring a string
        
        System.out.println("Enter a sentence");
        y=in.readLine();
        System.out.println(y);
        
        System.out.println("Enter a sentence");
        String x=sc.nextLine();
        sc.nextLine(); // Statement used to handle the inherent bugs in Scanner class
        System.out.println(x);
        
        System.out.println("Enter a word");
        String w=sc.next(); // io package does not let you input a single word
        System.out.println(w);
    }
}
