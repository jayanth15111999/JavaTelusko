@FunctionalInterface
interface A{
    void show(int i);
}
public class LambdaExp {
    public static void main(String s[]){
        A obj = (i) -> System.out.println("in show "+ i);
        obj.show(5);
    }
}
