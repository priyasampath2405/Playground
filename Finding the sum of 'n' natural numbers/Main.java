import java.util.*; 
import java.lang.*;  
class Main
{
    public static int recurSum(int n) 
    { 
        if (n <= 1) 
            return n; 
        return n + recurSum(n - 1); 
    } 
    public static void main(String args[]) 
    { 
       Scanner s=new Scanner(System.in);
      int num=s.nextInt();
        System.out.println(recurSum(num)); 
    } 
} 