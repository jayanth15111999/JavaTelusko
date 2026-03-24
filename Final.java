class Calculator{
    public int add(int x, int y){
        return x + y;
    }
    final public void show(){
        System.out.println("in jayanth");
    }
}
class OtherCalc extends Calculator{
    public void show(){
        System.out.println("in other");
    }
}
public class Final {
    public static void main(String s[]){
        OtherCalc obj = new OtherCalc();
        obj.show();
        int a = obj.add(2,3);
        System.out.println(a);

    }
}