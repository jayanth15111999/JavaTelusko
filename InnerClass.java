class A
 {
    public void show(){
    System.out.println("in show");
}
    static class B{
    public void config(){
        System.out.println("in config");}
    }
}
public class InnerClass {
    public static void main(String s[]){
        A obj = new A();
        obj.show();

        A.B obj2= new A.B();
        obj2.config();


    }
}
