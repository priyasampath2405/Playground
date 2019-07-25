import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
      // Type your code here  
      Scanner s=new Scanner(System.in);
      String str=s.nextLine();
      StringBuilder sb=new StringBuilder(str);
      String rep1=s.nextLine();
      String rep2=s.nextLine();
      System.out.print(str.replace(rep1,rep2));
    }
}