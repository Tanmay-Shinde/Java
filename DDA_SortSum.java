package PracticalQuestions;
import java.util.*;
public class DDA_SortSum
{
    Scanner ob=new Scanner(System.in);
    int A[][];
    int m,n;
    int a[];
    int s=0;
    DDA_SortSum(int x,int y)
    {
        m=x;
        n=y;
        A= new int[m][n];
        a= new int[m*n];
    }

    void input()
    {
        System.out.println("Enter "+(m*n)+" integers in the array");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                A[i][j] = ob.nextInt();
            }
        }
    }

    void display()
    {
        if(s++ == 0)
        {
            System.out.println("Original Matrix");
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print(A[i][j]);
                }
                System.out.println();
            }
            System.out.println("Sum of boundary elements (Unsorted) = "+ Calc_sum());
        }
        else
        {
            System.out.println("Sorted Matrix");
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print(A[i][j]);
                }
                System.out.println();
            }
            System.out.println("Sum of boundary elements (Sorted) = "+ Calc_sum());
        }
    }

    int Calc_sum()
    {
        int s=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0 || i==(m-1) || j==0 || j==(n-1))
                {
                    s = s + A[i][j];
                }
            }
        }
        return s;
    }

    void assign_sda()
    {
        int k=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[k] = A[i][j];
                ++k;
            }
        }
    }

    void sort()
    {
        int l = m*n;
        int min;
        int t;
        for(int i=0;i<(l-1);i++)
        {
            min=i;
            for(int j=i+1;j<l;j++)
            {
                if(a[j]>a[min])
                {
                    min=j;
                }
                t=a[min];
                a[min]=a[i];
                a[i]=t;
            }
        }
    }

    void assign_dda()
    {
        int k=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                A[i][j] =a[k];
                ++k;
            }
        }
    }

    static void main()
    {
        outer:
        while(true)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number of rows");
            int x=sc.nextInt();
            if(x>2 && x<8)
            {
                while(true)
                {
                    System.out.println("Enter the number of columns");
                    int y=sc.nextInt();
                    if(y>2 && y<8)
                    {
                        DDA_SortSum ob= new DDA_SortSum(x,y);
                        ob.input();
                        ob.display();
                        ob.assign_sda();
                        ob.sort();
                        ob.assign_dda();
                        ob.display();
                        break outer;
                    }
                    else
                    {
                        System.out.println("The number of columns must be greater than 2 and less than 8");
                    }
                }
            }
            else
            {
                System.out.println("The number of rows must be greater than 2 and less than 8");
            }
        }
    }
}
