import java.util.Scanner;

public class UserInputScanner{
    public static void main(String s[]){
        System.out.println("enter the number");
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);
        sc.close();
    }
}