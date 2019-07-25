import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int sum=0;
      for(int count=1;count<=n;count++)
      {
        sum=sum+count;
      }
      System.out.println(sum);
	}
}