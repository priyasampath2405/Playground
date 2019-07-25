import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
       Scanner s= new Scanner(System.in);
      int n=s.nextInt();
      int sum=0;
      while(n>0)
      {
        int a= n % 10;
        sum = sum+a;
        int b = n/10;
        n = b;
      }
     
      System.out.println(sum);
      
	}
}