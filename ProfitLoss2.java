public class ProfitLoss2
{
    void main(int cp,int sp)
    {
        if(cp>sp)
        {
            System.out.println("Loss");
        }
        else if (sp>cp)
        {
            System.out.println("Profit");
        }
        else 
        {
            System.out.println("Neither Profit nor Loss");
        }
    }
}