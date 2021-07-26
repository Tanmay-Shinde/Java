package Strings;
import java.util.*;
public class Max_Consonants
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        String s,a="",maxs="";
        char ch1,ch2,ch;
        int l,l1=0,k=0,max=0;

        System.out.println("Enter a sentence");
        s=sc.nextLine();
        s=s+" ";
        l=s.length();
        for(int i=0;i<l;i++)
        {
            ch1=s.charAt(i);
            if(ch1!=' ')
            {
                a=a+ch1;
            }
            else
            {
                l1=a.length();
                for(int j=0;j<l1;j++)
                {
                    ch2=a.charAt(j);
                    ch=Character.toUpperCase(ch2);
                    if(ch!='A' ||ch!='E' ||ch!='I' ||ch!='O' ||ch!='U')
                    {
                        if(!(Character.isDigit(ch)))
                        {
                            k++;
                        }
                    }
                    if(k>max)
                    {
                        max=k;
                        maxs=a;
                    }
                    
                }
                a="";k=0;
            }
        }
        System.out.println("The word with maximum no. of consonants is: "+maxs);
        System.out.println("The length of the word with maximum no. of consonants is: "+max);
    }
}