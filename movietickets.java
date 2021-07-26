import java.io.*;
public class movietickets
{
    void main()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int n;
        System.out.println("1. Lower Stall");
        System.out.println("2. Higher Stall");
        System.out.println("3. Balcony");
        System.out.println("4. Gold");
        System.out.println("Please enter your preffered seating");
        int ch = Integer.parseInt(in.readLine());

        switch(ch)
        {
            case 1:
            System.out.println("Enter the number of tickets you would like to purchase");
            n=Integer.parseInt(in.readLine());
            System.out.println("Payable Amount = "+(n*100));
            break;

            case 2:
            System.out.println("Enter the number of tickets you would like to purchase");
            n=Integer.parseInt(in.readLine());
            System.out.println("Payable Amount = "+(n*150));
            break;

            case 3:
            System.out.println("Enter the number of tickets you would like to purchase");
            n=Integer.parseInt(in.readLine());
            System.out.println("Payable Amount = "+(n*250));
            break;

            case 4:
            System.out.println("Enter the number of tickets you would like to purchase");
            n=Integer.parseInt(in.readLine());
            System.out.println("Payable Amount = "+(n*350));
            break;

            default:
            System.out.println("Invalid input");
        }
        System.out.println("Thank You");
    }
}