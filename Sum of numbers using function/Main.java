import java.util.Scanner;
class Main{
  public static int sum(int num)
  {
    int sum=0;
   for (int i=1;i<=num;i++)
   { 
     sum=sum+i;
    
   }
    return sum;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int add=sum(n);
      System.out.println(add);
	}
}