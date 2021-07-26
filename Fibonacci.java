package Loops.Loops_DoWhile;
public class Fibonacci
{
    public static void main()
    {
        int i=0;
        int j=1;
        int l;
        System.out.print(i+",");
        System.out.print(j+",");
        int k=3;
        do
        {
            l=i+j;
            System.out.print(l+",");
            i=j;
            j=l;
            
            k++;
        }while(k<=10);
    }
}
