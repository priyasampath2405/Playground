import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      // Type your code here
       Scanner s=new Scanner(System.in);
  int n=s.nextInt();
      int temp=0;
  int list[]=new int [n];
  for(int i=0;i<n;i++)
  {
    list[i]=s.nextInt();
  }
      int k=s.nextInt();
      for(int i=0;i<n;i++)
      {
        for(int j=i+1;j<n;j++)
        {
         if(list[i]<list[j])
         {
          temp=list[i];
          list[i]=list[j];
          list[j]=temp;
         }
        }
      }
      System.out.print(list[k-1]);
    }   
}