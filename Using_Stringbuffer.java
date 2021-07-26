package String_Buffer;

public class Using_Stringbuffer
{
    public static void main()
    {
        StringBuffer k = new StringBuffer("Computer");
        
        String xx = "is easy and fun to work with";        
        System.out.println(xx.length());
        
        StringBuffer x = new StringBuffer(25);
        x=new StringBuffer(xx);
        System.out.println(x);
        
        k.append(x);
        System.out.println(k);
        
        k.insert(8,"s ");
        System.out.println(k);
        
        k.delete(1,8);
        System.out.println(k);
        
        k.setLength(15);
        System.out.println(k);
        
        String mm="Commuter";
        StringBuffer m = new StringBuffer(mm);
        
        m.setCharAt(3,'p');
        System.out.println(m);
        
        m.reverse();
        System.out.println(m);
        
        StringBuffer n = new StringBuffer("COMPUTER");
        n.setLength(1);
        System.out.println(n);
    }
}
