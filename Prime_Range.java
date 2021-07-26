package Loops.Loops_For.Nested_For;
public class Prime_Range
{
    static void main()
    {
        int k=0;
        for(int i=2;i<=250;i++)
        {
            for(int j=2;j<i;j++)         
            {
                if(i%j==0)
                {
                    k++;
                }
            }    
            if(k==0)
            {
                System.out.println(i);
            }
            k=0;
        }
    }
}
