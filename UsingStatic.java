package Class_UDD;
public class UsingStatic
{
    int x;
    static int count;
    void calc()
    {
        x++;
        count++;
        System.out.println("count ="+count);
        System.out.println("x= "+x);
    }
    void main()
    {
        calc();
    }
}
