public class Logical_Operators2
{
    void main(int a,int b,int c)
    {
        if(a==b && a==c)     
        {
            System.out.println("All are Equal");
        }
        else if(a>=b && a>=c)     
        {
            System.out.println(a+" is the largest");
        }
        else if(b>=a && b>=c)     
        {
            System.out.println(b+" is the largest");
        }
        else
        {
            System.out.println(c+" is the largest");
        }
    }
}
