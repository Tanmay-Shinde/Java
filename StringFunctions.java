package Strings;

public class StringFunctions
{
    static void main()
    {
        String x="Malayalam  ";
        int len=x.length();// Starts from 1 to the last character
        System.out.println("Length of string= "+len);
        
        int c=x.indexOf('a'); // counts the position of the first occurence of the argument (starting from 0)
        System.out.println("Index of a= "+c);
        
        int y=x.lastIndexOf('a'); // counts the position of the last occurence of the argument (starting from 0)
        System.out.println("Last Index of a= "+y);
        
        int l=x.indexOf("lam"); 
        System.out.println("Index of \"lam\"= "+l);
        
        int k=x.lastIndexOf(' ');
        System.out.println("Last Index of Blankspace= "+k);
        
        String s=x.substring(3); //extracts all the characters from INDEX 3 to the last index
        System.out.println(s);
        
        String s2=x.substring(3,7); //extracts all the characters from INDEX 3 to the INDEX 6 
        System.out.println(s2);
        
        String p=x.replace('a','b'); // Replaces all the a's in the string with b's
        System.out.println(p);
         
        System.out.println(x.concat(p)); //System.out.println("asd".concat("dsa")); concat == JOINING
        System.out.println(x.equals(p)); //Returns a boolean value
        
        String n="malayalam  ";
        System.out.println(x.equals(n));
        System.out.println(x.equalsIgnoreCase(n));
        System.out.println(x.compareTo(n));
        //ASCII values of the alphabets are compared(diff between the 1st & 2nd
        //Both strings are same if returned value is 0
        //if diff<0 : First string is smaller than the second
        //if diff>0 : First string is larger than the second
        System.out.println(n.startsWith("M"));
        System.out.println(n.endsWith("yam"));
        
        System.out.println("Shubha".compareTo("Shubham"));
        
        String q="   WEL   COME   ";//removes leading and preceding spaces
        System.out.println(q.trim());
        
        System.out.println("Item".compareTo("It"));
    }
}
