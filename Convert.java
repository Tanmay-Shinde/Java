package Functions;
public class Convert
{
    float convert(double a)
    {
        float x=(float)a;
        return x;
    }
    void convert(char s)
    {
        int y=(int)s;
        System.out.println("Converted character: "+y);
    }
    void main()
    {
        double a=7.57d;
        float x=convert(a);
        System.out.println("Converted double value: "+x);
        convert('v');
    }
}
