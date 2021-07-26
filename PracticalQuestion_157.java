import java.io.*;
public class PracticalQuestion_157
{
    InputStreamReader read= new InputStreamReader(System.in);
    BufferedReader in = new BufferedReader(read);

    String s;
    int l;
    boolean t=true;
    void input()throws IOException
    {
        while(true)
        {
            System.out.println("Enter a sentence");
            s=in.readLine();
            s=s+" ";
            l=s.length();
            if(l<0 && l>50)
            {
                System.out.println("The sentence cannot have more than 50 characters.");
                System.out.println("Please enter a sentence again:");
                System.out.println("/f");
            }
            else
            {
                break;
            }
        }
    }

    void display()
    {
        s=s.toUpperCase();
        System.out.println("The sentence in upper case:");
        System.out.println(s);
    }
    
    void potential()
    {
        System.out.println("Word \t Potential");
        String st="";
        int sum=0;
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
            {
                st=st+ch;
            }
            else
            {
                int stl=st.length();
                for(int j=0;j<stl;j++)
                {
                    char ch1=st.charAt(j);
                    sum=sum+ch1;
                }                
                System.out.println(st+"\t"+sum);
                st="";
                sum=0;
            }
        }
    }
    
    void reverse()
    {
        for(int i=(l-1);i>=0;i--)
        {
            char ch2=s.charAt(i);
            System.out.print(ch2);
        }
        System.out.println();
    }
    
    void wordsSW_LT()
    {
        System.out.println("The words starting with T or L are:");
        String st="";
        int k=0;
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
            {
                st=st+ch;
            }
            else
            {
                char ch1=st.charAt(0);
                if(ch1=='L' || ch1 =='T' || ch1=='l' || ch1=='t')
                {
                    System.out.println(st);
                    k++;
                }
                st="";
            }
        }
        if(k==0)
        {
            System.out.println("None of the words begin with T or L");
        }
    }
    
    void main()throws IOException
    {
        while(t==true)
        {
            PracticalQuestion_157 ob = new PracticalQuestion_157();
            ob.input();
            ob.display();
            ob.potential();
            ob.reverse();
            ob.wordsSW_LT();
            System.out.println("Do you wish to continue?");
            System.out.println("Press Y to continue or any other key to terminate the program");
            char ch=in.readLine().charAt(0);
            if(ch=='Y' || ch=='y')
            {
                t=true;
            }
            else
            {
                System.out.println("Thank You");
                System.out.println("_____Program Terminated_____");
                t=false;
            }
        }
    }
}
