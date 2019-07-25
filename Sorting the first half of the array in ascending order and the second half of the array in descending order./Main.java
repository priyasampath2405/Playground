import java.util.*;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
     a[i]=s.nextInt();
    }
    for(int i=0;i<n/2;i++)
    {
      for(int j=i+1;j<n/2;j++)
      {
       if(a[i]>a[j])
       {
        int temp=a[j];
         a[j]=a[i];
         a[i]=temp;
       }
      }
    }
    for(int i=0;i<n/2;i++)
    {
     System.out.print(a[i]+" ");
    }
    for(int i=n/2;i<n;i++)
    {
      for(int j=i+1;j<n;j++)
      {
       if(a[i]<a[j])
       {
        int temp=a[j];
         a[j]=a[i];
         a[i]=temp;
       }
      }
    }
    for(int i=n/2;i<n;i++)
    {
     System.out.print(a[i]+" ");
    }

  }
}