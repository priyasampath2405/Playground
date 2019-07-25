import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        for(int index1 = 1; index1 <= r; index1++)
        {
            for(int index2 = c; index2 > c - index1 ; index2--)
            {
                System.out.print(index2);
            }
            for(int index2 = 1; index2 <= c - index1; index2++)
            {
                System.out.print(r - index1 + 1);
            }
            System.out.println();
        }
    }
}