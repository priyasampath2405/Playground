import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner s = new Scanner(System.in);
  		// Type your code here
      int n=s.nextInt();
      int k=1;
      for(int i=1;i<=n;i++)
      {
       for(int j=1;j<=i;j++)
       { 
        if(k % 2==0)
        {
          System.out.print("#");
          k++;
        }
         else if(k%2==1)
         {
           System.out.print("*");
         k++;
         }
       }
        System.out.print("\n");
      }
    }
}