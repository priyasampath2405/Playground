import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int exponent = sc.nextInt();
        int c = 0,r = 1;
        while(c < exponent)
        {
            r = r * base;
            c++;
        }
        System.out.println(r);
    }
}