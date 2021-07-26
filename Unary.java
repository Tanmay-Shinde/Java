public class Unary
{
    void main()
    {
        int a=5;
        int c= ++a;//change value of a before assnignment of value
        System.out.println("Value of c="+c);
        System.out.println("Value of a="+a);
        
        int d=a++;// change value of a after it has been assigned to d
        System.out.println("Value of d="+d);
        System.out.println("Value of a="+a);
        
        int b=5;
        int x= --b;//change value of a before assnignment of value
        System.out.println("Value of x="+x);
        System.out.println("Value of b="+b);
        
        int y=b--;// change value of a after it has been assigned to d
        System.out.println("Value of y="+y);
        System.out.println("Value of b="+b);
    }
}
