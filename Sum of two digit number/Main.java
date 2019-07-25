import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int n1=n%10;
      int n2=n/10;
      int sum=n1+n2;
      System.out.println(sum);
	}
}