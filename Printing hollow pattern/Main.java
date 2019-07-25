import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      for(int i=1;i<=n;i++)
      {
       for(int j=1;j<=n;j++)
       {
        if(i>=2 && j>=2 && i<=n-1 && j<=n-1)
        {
         System.out.print(" ");
        }
       else
       { 
         System.out.print("*");
       }
           
       }
         System.out.print("\n");
      
      
      }
	}
}