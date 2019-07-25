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
        for(int index1 = 0; index1 <= arr_size - 1; index1++)
        {
            int key =  arr[index1];
            for(int index2 = index1+1; index2 <= arr_size-1; index2++)
            {       
                    if(arr[index2]>key)
                    System.out.println(key+","+arr[index2]+" ");
            }
        }
    }
}