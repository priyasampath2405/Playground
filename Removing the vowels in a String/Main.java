import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner s=new Scanner(System.in);
    String str=s.nextLine();
    StringBuilder sb=new StringBuilder(str);
    StringBuilder sb1 = new StringBuilder("");
   int len=sb.length();
    for(int i=0;i<len;i++)
    {
      char ch = sb.charAt(i);
           if((ch != 'a') && (ch != 'e') && (ch != 'i') && (ch != 'o') && (ch !='u'))
           {
               sb1.append(ch);
           }
           
       }System.out.println(sb1);
        
  }
}