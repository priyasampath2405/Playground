import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int size = str.length();
        int mid = size/2;
        for(int i = size-1; i >= 0 ; i--)
        {
            int count = 0;
            for(int s = 0;s < i; s++)
            {
            System.out.print(" ");
            count++;
            }
            if(i>=size/2)
            {
                int j = size/2; 
                while(count<size)
                {
                    System.out.print(str.charAt(j++));
                    count++;
                }
            }
            else
            {
                int j = size/2;
                while(count<=(size/2+i))
                {
                    System.out.print(str.charAt(j++));
                    count++;
                }
                j = 0;
                while(count < size)
                {
                    System.out.print(str.charAt(j++));
                    count++;
                }
            }
            System.out.println();
        }
    }
}