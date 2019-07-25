import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int arr[] = new int[size];
        for(int index = 0; index < size; index++)
        {
            arr[index] = s.nextInt();
        }
        int sum_arr[] = new int[3 * size];
        increasing_sub_array(size, arr, sum_arr);
    }
    public static void increasing_sub_array(int arr_size, int arr[], int sum_arr[])
    {
        for(int i= 0; i <= arr_size - 1; i++)
        {
            int key =  arr[i];
            int flag = 1;
            for(int j = i+1; j<=arr_size-1;j++)
            {
                if(arr[j]>key)
                {
                    for(int index3 = i; index3 <= j; index3++)
                    {
                        if(arr[index3]>arr[j])
                        flag = 0;
                    }
                    if(flag == 1)
                    System.out.println(key+","+arr[j]+" ");
                }
                flag = 1;
            }
        }
    }
}