import java.util.Scanner;

public class FinallyTry {
    public static void main(String s[]){
        Scanner sc = null;
        try{
        System.out.println("enter a number");
        sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);}
        finally{
            sc.close();
        }

    }
}
