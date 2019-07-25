import java.util.Scanner;
class Main
{
  public static int power(int num1,int num2)
  {
    int res=1;
    while(num2>=1)
    {
      res=res*num1;
      num2--;
    }
    return res;
  }
  public static void main(String args[])
  {
   Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    int b=s.nextInt();
    int c=power( a, b);
    System.out.println(c);
  }
}

