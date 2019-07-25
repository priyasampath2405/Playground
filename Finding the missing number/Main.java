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
      int missing_val=0;
      for(int val=1;val<=size;val++)
      {
         int is_found = 0;
            for(int indx = 0; indx <= size - 1; indx++){
                if(arr[indx] == val)
                {
                    is_found = 1;
                    break;
                }
            }
            if(is_found == 0){
                missing_val = val;
                break;
            }
        }
        System.out.print(missing_val);
      }
      
    }
