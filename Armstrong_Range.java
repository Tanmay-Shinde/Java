package Loops.Loops_For.Nested_For;
public class Armstrong_Range
{
    static void main()
    {
        int s=0;
        for(int i=100;i<=1000;i++)
        {
            int t=i;
            while(t!=0)
            {
                int a=t%10;
                s=s+(int)Math.pow(a,3);
                t=t/10;
            }
            if(s==i)
            {
                System.out.println(i);
            }
            s=0;
        }
    }
}
