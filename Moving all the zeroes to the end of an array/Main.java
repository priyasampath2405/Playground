import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner s=new Scanner(System.in);
      int size=s.nextInt();
      int arr[]=new int[size];
      for(int i=0;i<=size-1;i++)
      {
       arr[i]=s.nextInt();
      }
      zero_at_end(size,arr);
      for(int i=0;i<=size-1;i++)
      {
       System.out.print(arr[i]+ " ");
      }
    }
  public static void zero_at_end(int size,int arr[])
  {
   int count=0;
    for(int i=0;i<=size-1;i++)
    {
     if(arr[i]!=0)
     {
      int temp=arr[i];
       arr[i]=arr[count];
       arr[count]=temp;
       count++;
     }
    }
  }
}