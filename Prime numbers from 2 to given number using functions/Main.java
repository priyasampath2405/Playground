import java.util.Scanner;
class Main{
  public static boolean prime(int num)
  {
    boolean isprime=true;
    for(int i=2;i<=num/2;i++)
      {
        if(num % i ==0)
          { 
            isprime = false;
              break;
            }
       }
        return isprime;
    }
  

  public static void main (String[] args)
  {
	    // Type your code here
      Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       for(int j=2;j<n;j++)
     {
        if(prime(j))
         {
          System.out.println(j);
         } 
   }
  }
}
