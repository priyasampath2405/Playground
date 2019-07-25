import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String string1 = sc.nextLine();
        String string2 = sc.nextLine();
        int no_of_parts = sc.nextInt();
        String string3 = string1.replace(string1, string2);
        String flag[] = string3.split(" ",no_of_parts);
        for(String res: flag)
        System.out.println(res);
    }
}