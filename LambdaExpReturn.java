interface A{
    int add(int a, int b);
}
public class LambdaExpReturn {
    public static void main(String s[]){
    A obj = (i,j) -> i+j;
    int result = obj.add(2,3);
    System.out.println(result);
}
}