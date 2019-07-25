import java.util.*;
import java.lang.*;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int k=s.nextInt();
      int offset=0;
      int list[]=new int [n];
      for(int i=0;i<n;i++)
       {
         list[i]=s.nextInt();
       }
       int temp[]=new int[k];
      for(int i=0;i<=k-1;i++)
      {
        temp[i]=0;
    }
      for( int idx=0;idx<=n-1;idx++)
      { 
            temp[list[idx]-1]++;
        }
        
      for(int idx=0;idx<=k-1;idx++)
      {
      {
        System.out.println((idx+1)+" "+ temp[idx] );
       
      }
      }
    
    }
}
