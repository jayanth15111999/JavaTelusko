class A{
    public void show(){
        System.out.println("in a");
    }

}
class B extends A{
    @Override
    public void show(){
        System.out.println("in b");
    }
}
public class Annotations {
    public static void main(String s[]){
        A obj1 = new A();
        obj1.show();
        B obj = new B();
        obj.show();
    }
}
