package StringTokenizer;
import java.io.*;
import java.util.*;
public class ParagraphToken
{
    String str; //Storing the paragraph
    int n; //Storing the number of sentences
    int n2; //Storing the number of words
    int count; //Counter variable
    int k; //Counter for storing values in arr2[] and freq[]
    String arr[]; //Storing the tokens of the paragraph
    String arr2[]; //Storing the words required to display
    int freq[]; //Storing the frequency of words present in the paragraph
    StringTokenizer s; //ST object for tokenizing the sentences
    StringTokenizer s2; //ST object for tokenizing the words

    void input()throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        while(true) //To Input Number of Sentences
        {
            System.out.println("Please Enter the number of sentences");
            n= Integer.parseInt(in.readLine());
            if(n>0 && n<4)
            {
                break;
            }
            else
            {
                System.out.println("Invalid Input");
                System.out.println("The number of sentences can be less than 4 only");
            }
        }
        while(true) //To Input the Paragraph
        {
            System.out.println("Please enter the paragraph in uppercase");
            str = in.readLine();
            str=str.toUpperCase();

            s=new StringTokenizer(str,".?"); // Using delimiters '.' or '?' to separate sentences
            int k=s.countTokens();// Counting Number of Sentences
            if(k!=n)
            {
                System.out.println("The number of sentences is not equal to "+n);
            }
            else
            {
                break;
            }
        }
    }

    void countingWords()
    {
        s2=new StringTokenizer(str," .?"); //Using Delimiters ' ' or '.' or '?' to separate words
        n2=s2.countTokens();
        System.out.println("Total number of words: "+n2);
    }

    void StoreinArray()
    {
        arr = new String[n2];
        arr2 = new String[n2];
        freq = new int[n2];
        for(int i=0;i<n2;i++)
        {
            arr[i]=s2.nextToken();
        }
    }

    void frequencyCount()
    {
        count = 1;
        k=0;
        int d=0;
        for(int i=0;i<n2;i++)
        {
            String st=arr[i];
            if(i==0) //Checking for the first token
            {
                for(int j=1;j<n2;j++)
                {
                    if(arr[j].equals(st))
                    {
                        ++count;
                    }
                }
                arr2[k]=st;
                freq[k]=count;
                count=0;
                k++;
            }
            else // Checking for the rest of the tokekens
            {
                for(int j=(i-1);j>=0;j--) // Checking if the token is present earlier in the paragraph 
                {
                    String st2=arr[j];
                    if(st2.equals(st)) 
                    {
                        d++;
                        break; //Loop will break with d=1 if the token is found earlier
                    }
                    else
                        continue;
                }
                if(d==0) //If the token is not found earlier, check for it in the sentences after it
                {
                    for(int j=i;j<n2;j++)                 
                    {
                        if(arr[j].equals(st))
                        {
                            ++count;
                        }
                    }
                    arr2[k]=st;
                    freq[k]=count;
                    count=0;
                    k++;
                }
                d=0;
            }
        }
    }
    
    void sortByFrequency() //Using BubbleSort to sort the frequency array first and the string array with it
    {
        int t=0;
        String ts="";
        for(int i=0;i<(n2-1);i++)
        {
            for(int j=0;j<(n2-1-i);j++)
            {
                if(freq[j]>freq[j+1])
                {
                    t=freq[j];
                    freq[j]=freq[j+1];
                    freq[j+1]=t;
                    
                    ts=arr2[j];
                    arr2[j]=arr2[j+1];
                    arr2[j+1]=ts;
                }
            }
        }
    }
    
    void display()
    {
        System.out.println("Word \t\t Frequency");
        for(int i=0;i<n2;i++)
        {
            if(freq[i]!=0) // To avoid printting null values
                System.out.println(arr2[i]+"\t\t"+freq[i]);
        }
    }
    
    public static void main()throws IOException
    {
        ParagraphToken ob=new ParagraphToken();
        ob.input();
        ob.countingWords();
        ob.StoreinArray();
        ob.frequencyCount();
        ob.sortByFrequency();
        ob.display();
    }
}
