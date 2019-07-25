import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner s=new Scanner(System.in);
      String s1=s.nextLine();
      StringBuilder sb=new StringBuilder(s1);
      int str_len=sb.length();
      reverse_string(sb,0,str_len-1);
      int start_inx=0;
      for(int i=0;i<str_len;i++)
      {
       if(sb.charAt(i)==' ')
         {
           reverse_string(sb,start_inx,i-1);
             start_inx=i+1;
         }
        else if(i==(str_len-1))
        {
        reverse_string(sb,start_inx,i-1);
             start_inx++;
        }
      }
      System.out.print(sb);
    }
    // Function to reverse a string
    public static void reverse_string(StringBuilder sb, int start_inx, int end_inx)
    {
        // Type your code here
      int end=end_inx;
      int front=start_inx;
      while(front<end)
      {
       char temp=sb.charAt(front);
        sb.setCharAt(front,sb.charAt(end));
        sb.setCharAt(end,temp);
        front++;
        end--;
      }
    }
}