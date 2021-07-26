package Functions;

public class ImpureMethods
{
    void add(int x)
    {
        ++x;
        System.out.println("Changed value = "+x);        
    }
    void main()
    {
        add(5);
    }
}
