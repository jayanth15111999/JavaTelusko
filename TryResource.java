import java.util.Scanner;

public class TryResource {
    public static void main(String s[])
    {
        try(Scanner sc = new Scanner(System.in))
        {
        System.out.println("enter a number");
        int num = sc.nextInt();
        System.out.println(num);
        }
    }
}
