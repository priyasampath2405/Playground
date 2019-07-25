import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner s=new Scanner(System.in);
    String str=s.nextLine();
    String[] word=str.split(" ");
    for(int i=0;i<word.length;i++)
    {
     if(word[i]!=null)
     {
      for(int j=i+1;j<word.length;j++)
      {
       if(word[i].equals(word[j]))
       {
        word[j]=null;
       }
      }
     }
    }
    for(int k=0;k<word.length;k++)
    {
     if(word[k]!=null)
     {
     System.out.print(word[k]+" ");
     }
    }
  }
}