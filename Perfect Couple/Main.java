import java.util.Scanner;
class Main{
  public static void perfect(int arr_size,int arr[],int value)
  {
   for(int i=0;i<=arr_size-1;i++)
   {
    for(int j=i+1;j<=arr_size-1;j++)
    {
     int sum=arr[i]+arr[j];
      if (sum==value)
      {
       System.out.println(arr[i]+","+" " +arr[j]);
      }
    }
   }
  }
  
    public static void main(String args[]) {
      // Type your code here
      Scanner s=new Scanner(System.in);
      int arr_size=s.nextInt();
      int arr[]=new int[arr_size];
      for(int i=0;i<=arr_size-1;i++)
      {
       arr[i]=s.nextInt();
      }
      int value=s.nextInt();
      perfect(arr_size,arr,value);
    }
}
