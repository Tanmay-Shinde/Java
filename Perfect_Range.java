package Loops.Loops_For.Nested_For;
public class Perfect_Range
{
    static void main()
    {
        int s=0;
        for(int n=2;n<=100;n++)
        {
            for(int i=1;i<n;i++)
            {
                if(n%i==0)                 
                {
                    s+=i;
                }
            }
            if(s==n)
            {
                System.out.println(n);
            }
            s=0;
        }
    }
}

