import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner s= new Scanner(System.in);
      int n=s.nextInt();
      int L_D=n % 10;
      while(n>10)
      {
      n=n/10;
      }
      int F_D=n;
      int sum=L_D + F_D;
      System.out.println(sum);
	}
}