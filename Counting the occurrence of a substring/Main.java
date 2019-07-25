import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner s=new Scanner(System.in);
      String s1=s.nextLine();
      String s2=s.nextLine();
      int s1_len=s1.length();
      int s2_len=s2.length();
      int count=0;
      for(int i=0;i<(s1_len-s2_len+1);i++)
      {
       boolean is_match=true;
       for(int j=0;j<s2_len;j++)
       {
        if(s1.charAt(i+j)!=s2.charAt(j))
        {
         is_match=false;
        }
       }
        if(is_match==true)
          count=count+1;
       }
      System.out.print(count);
      }
      
      
    }