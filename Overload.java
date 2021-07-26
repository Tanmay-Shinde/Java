package Functions;
public class Overload
{
    void compare(int a,int b)
    {
        int max=(a>b)?a:b;
        System.out.println("Largest = "+max);        
    }
    void compare(char x,char y)
    {
        char max=(char)((x>y)?x:y);
        System.out.println("Largest = "+max); 
    }
    void main()
    {
        compare(5,6);
        compare('a','b');
        System.out.println("Thank You"); 
    }
}
