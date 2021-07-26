package Class_UDD;
import java.util.*;
public class Student
{
    Scanner sc=new Scanner(System.in);
    String name;
    double eng,math,sci,lang2,cs,total,per;
    void accept()
    {
        System.out.println("Enter your name");
        name=sc.nextLine();
        System.out.println("Enter your English marks");
        eng=sc.nextDouble();
        System.out.println("Enter your Science marks");
        sci=sc.nextDouble();
        System.out.println("Enter your Math marks");
        math=sc.nextDouble();
        System.out.println("Enter your 2nd lang marks");
        lang2=sc.nextDouble();
        System.out.println("Enter your Computer Science marks");
        cs=sc.nextDouble();
    }
    void calculate()
    {
        total=eng+math+sci+lang2+cs;
        per=total/5;
    }
    void display()
    {
        System.out.println("Name - "+name);
        System.out.println("English - "+eng);
        System.out.println("Maths - "+math);
        System.out.println("Science - "+sci);
        System.out.println("2nd Lang - "+lang2);
        System.out.println("CS - "+cs);
        System.out.println("Total - "+total);
        System.out.println("Percentage - "+per);
    }
    static void main()
    {
        Student ob=new Student();
        ob.accept();
        ob.calculate();
        ob.display();
        
        Student ob1=new Student();
        ob1.accept();
        ob1.calculate();
        ob1.display();
    }
}
