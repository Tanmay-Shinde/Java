package Functions;
public class PassByRef
{
    static void add(int x[])
    {
        int l=x.length;
        for(int i=0;i<l;i++)
        {
            x[i]=x[i]+2;
        }
        System.out.println("Array after changes:");
        for(int i=0;i<l;i++)
        {
            System.out.print(x[i]+", ");
        }
        System.out.println();
    }
    static void main()
    {
        int a[]={1,2,3,4,5,6,7,8,9,10};
        System.out.println("Array before changes:");
        for(int i=0;i<10;i++)
        {
            System.out.print(a[i]+", ");
        }
        System.out.println();
        add(a);
        System.out.println("Array after calling add() method:");
        for(int i=0;i<10;i++)
        {
            System.out.print(a[i]+", ");
        }
    }
}

