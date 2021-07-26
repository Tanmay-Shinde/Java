package StringTokenizer;
import java.util.StringTokenizer;
public class MultipleDelimeters
{
    public static void main()
    {
        String msg ="http://10.123.43.67:80/";
        StringTokenizer s=new StringTokenizer(msg,":/.");
        while(s.hasMoreTokens())
        {
            System.out.println(s.nextToken());
        }
    }
}
