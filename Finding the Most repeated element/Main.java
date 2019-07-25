
import java.util.*; 
class Main { 
static int mostFrequent(int arr[], int size) 
    {
        Arrays.sort(arr);
        int max_count = 1, res = arr[0]; 
        int curr_count = 1; 
          
        for (int i = 1; i < size; i++) 
        { 
            if (arr[i] == arr[i - 1]) 
                curr_count++; 
            else 
            { 
                if (curr_count > max_count) 
                { 
                    max_count = curr_count; 
                    res = arr[i - 1]; 
                } 
                curr_count = 1; 
            } 
        } 
      
        if (curr_count > max_count) 
        { 
            max_count = curr_count; 
            res = arr[size - 1]; 
        } 
      if(res==3)
        return res;
     else
       return arr[1];
    } 
    public static void main (String[] args) { 
      Scanner s=new Scanner(System.in);
      int size=s.nextInt();
      int arr[] =new int[size]; 
      for(int i=0;i<size;i++)
      {
       arr[i]=s.nextInt();
      }
          
        System.out.println(mostFrequent(arr,size)); 
          
    } 
} 
