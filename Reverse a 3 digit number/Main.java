import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int n1=n%10;
    int a=n/10;
    int b=a%10;
    int n3=n/100;
    int rev=(n1*100)+(b*10)+n3;
      System.out.println(rev);
  }
}