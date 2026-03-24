@FunctionalInterface
interface A{
    void show();
}
/*class B implements A{
    public void show(){
        System.out.println("in class");
    }
}*/
public class FunctionalInter {
    public static void main(String s[]){
        A obj = new A(){
            public void show(){
                System.out.println("in interface");
            }
        };
        obj.show();
    }
}
