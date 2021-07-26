import java.io.*;
public class Commission
{
    void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        double sp,cp;
        
        System.out.println("Enter the CP & SP");
        cp=Double.parseDouble(in.readLine());
        sp=Double.parseDouble(in.readLine());
              
        if(cp>sp)
        {
            System.out.println("Loss = "+(cp-sp));
            System.out.println("No Commission");
        }
        else if (sp>cp)
        {
            System.out.println("Profit = "+(sp-cp));
            double com= cp+ 0.1*sp;
            System.out.println("Commission = "+com);
        }
        else 
        {
            System.out.println("Neither Profit nor Loss");
            System.out.println("No Commission");
        }
    }
}