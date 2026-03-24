public class wrapper {
    public static void main(String s[]){
        int num1 = 12;
        Integer num = num1; //auto boxing

        int num2 = num; //auto unboxing
        System.out.println(num2);

        String str = "10";
        int i = Integer.parseInt(str);
        System.out.println(i*2);
    }
}
