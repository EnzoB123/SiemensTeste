
import java.util.Scanner;
 
public class Main {
     
    // Returns true if it is possible to convert
    // str1 to str2 using k operations.
    public static String ConcatERemove(String s, String t, int k)
    {
       
        if ((s.length() + t.length()) < k)
            return "sim";
     
      
        int eqDist = 0;
        for (int i = 0; i < Math.min(s.length(),
                                t.length()); i++)
        {
            if (s == t)
            	eqDist++;
            else
                break;
        }
     
        
        if ((k - s.length() - t.length() +
                     2 * eqDist) % 2 == 0)
            return "sim";
     
       
        return "não";
    }
     
     
     
    // Driver program
    public static void main (String[] args)
    {
    	Scanner sc = new Scanner(System.in);
	    System.out.println("escreva a primeira frase");
	    String first = sc.next();
	    System.out.println("escreva a segunda frase");
	    String second = sc.next();
	    System.out.println("escreva a quantidade de operações");
	    int ops = sc.nextInt();
	    
	    System.out.println(ConcatERemove(first, second, ops));
	

        sc.close();
    }
}
 
