import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    
          Scanner scr = new Scanner(System.in);
    int array_size = scr.nextInt();
    int arr[] = new int[array_size];
    for(int i = 0;i<arr.length;i++)
    {
      arr[i] = scr.nextInt();
      
    }
    int maximum = arr[0];
    int b = 0;
    for(int i = 0;i<=array_size-1;i++)
    {
      if(maximum<arr[i])
      {
        maximum = arr[i];
        b = i;
      }
    }
    System.out.println(b);
  }
}