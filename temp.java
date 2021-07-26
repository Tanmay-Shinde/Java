import java.util.*;
public class temp
{ 
    static void main()
    {
        String input = "1926 • 1941";
        System.out.println(input);
        String output = input.replaceAll("(?i)[^\\w\\s]+", "|");
        System.out.println(output);
    }
} 
