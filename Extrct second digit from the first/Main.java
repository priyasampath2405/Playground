import java.util.Scanner;
class Main {
  public static void main (String[] args){
	    // Type your code here
      Scanner s= new Scanner(System.in);
      int n=s.nextInt();
      int a= n;
      while(n>100)
      {
       n = n/10;
      }
      a = n;
    int S_D= n % 10;
    System.out.println(S_D);
  }
}