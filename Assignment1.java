import java.io.*;
public class Assignment1
{
    public static void main()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        int wt;char t;double charge=0.0d;

        System.out.println("Enter the type of mail");
        System.out.println("O for Ordinary mail");
        System.out.println("E for Express mail");
        t=in.readLine().charAt(0);

        switch(t)
        {
            case 'O':
            case 'o':
            System.out.println("Enter the weight of the parcel");
            wt= Integer.parseInt(in.readLine());
            if(wt>0 && wt<=100)
                charge = 50;
            else if(wt>100 && wt<=500)
                charge = 50 + (wt-100)*0.4;
            else if(wt>500)
                charge = 50 + 160 + (wt-500)*0.35;
            else
                System.out.println("Invalid weight");
            break;

            case 'E':
            case 'e':
            System.out.println("Enter the weight of the parcel");
            wt= Integer.parseInt(in.readLine());
            if(wt>0 && wt<=100)
                charge = 80;
            else if(wt>100 && wt<=500)
                charge = 80 + (wt-100)*0.7;
            else if(wt>500)
                charge = 80 + 160 + (wt-500)*65;
            else
                System.out.println("Invalid weight");
            break;

            default:
            System.out.println("Invalid choice");
        }
        System.out.println("Total payable charge = Rs "+charge);
    }
}
