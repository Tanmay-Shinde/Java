package Loops.Loops_For.Nested_For;
public class Pattern4
{
    static void main()
    {
        for(int i=1;i<=5;i++)    
        {
            for(int j=5;j>=i;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
