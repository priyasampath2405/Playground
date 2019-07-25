import java.util.Scanner;
class Main{
  public static int greatest(int a,int b,int c)
  {
    if((a>b) && (a>c))
     return a;
    else if (b>c)
      return b;
    else
      return c;
  }
	public static void main (String[] args){
      Scanner s=new Scanner(System.in);
      int n1=s.nextInt();
      int n2=s.nextInt();
      int n3=s.nextInt();
      int great=greatest(n1,n2,n3);
      System.out.println(great);

      // Type your code here
	}
}