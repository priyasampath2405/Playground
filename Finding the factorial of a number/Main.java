import java.util.*;
class Main
{  
    public static int factorial(int n) 
    { 
        if (n == 0) 
          return 1; 
          
        return n*factorial(n-1); 
    } 
    public static void main(String[] args)  
    { 
     Scanner s=new Scanner(System.in);
    int num=s.nextInt();
    System.out.print(factorial(num));    
    } 
} 