package Loops.Loops_For;
public class Fibonacci
{
    public static void main()
    {
        int i=0;
        int j=1;
        int l;
        System.out.print(i+",");
        System.out.print(j+",");
        for(int k=3;k<=10;k++)
        {
            l=i+j;
            System.out.print(l+",");
            i=j;
            j=l;
        }
    }
}
