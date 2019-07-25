import java.util.Scanner;
class Main
{
  public static int square(int num)
  {
    int sq=num * num;
    return sq;
  }
  public static void main (String[] args)
    {
	 // Type your code here  
    Scanner s=new Scanner(System.in);
    int n= s.nextInt();
    int squ=square(n);
    System.out.println(squ);
	} 
}