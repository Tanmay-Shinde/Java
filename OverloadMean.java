package Functions;
public class OverloadMean
{
    float findMean(int a,int b)
    {
        float mean=(a+b)/2;
        return(mean);
    }
    float findMean(int a[])
    {
        int s=0;
        int l=a.length;
        for(int i=0;i<l;i++)    
        {
            s=s+a[i];
        }
        float mean=s/l;
        return(mean);
    }
    void main()
    {
        float a1=findMean(7,14);
        int x[]={1,2,3,4,5};
        float a2=findMean(x);
        
        System.out.println("Mean of two numbers 7 & 14 = "+a1);
        System.out.println("Mean of numbers in the array {1,2,3,4,5}= "+a2);
    }
}
