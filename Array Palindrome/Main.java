import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner s =new Scanner(System.in);
      int size=s.nextInt();
      int arr[]=new int[size];
      for(int i=0;i<size;i++)
      {
       arr[i]=s.nextInt();
      }
      int flag=0;
      int left=0;
      int right=size-1;
      while(left<=right)
      {
      if(arr[left]!=arr[right])
       {
         flag=1;
        break;
       }
        left++;
        right--;
      }
      
      if(flag==0)
         {
          System.out.println("Yes");
         }
         else
         {
         System.out.println("No");
    }
    }
}