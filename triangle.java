public class triangle
{
    void main(int a,int b,int c)
    {
        if((a+b)>c && (a+c)>b && (b+c)>a)
        {
            System.out.println("Triangle with dimensions "+a+","+b+","+c+" is possible");
        }
        else
        {
            System.out.println("Triangle with dimensions "+a+","+b+","+c+" is not possible");
        }
    }
}
