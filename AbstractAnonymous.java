abstract class A{
    public abstract void show();
    public void config(){
        System.out.println("in config");
    }
}
public class AbstractAnonymous {
    public static void main(String s[]){
        A obj = new A(){
            public void show(){
            System.out.println("in new Show");
            }
            public void config(){
            System.out.println("in new config");
            }
        };
        obj.show();
        obj.config();

    }
}
