import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int temp=n,c=0;
      while(n>0)
      {
        int a=n % 10;
         n= n/10;
        c= c+(a*a*a);
      }
      if(temp == c)
        System.out.println("Armstrong Number");
      else 
        System.out.println("Not a Armstrong Number");
    }
}

