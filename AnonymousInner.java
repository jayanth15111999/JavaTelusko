class A{
    public void show(){
        System.out.println("in show");
    }
}
public class AnonymousInner {
    public static void main(String s[]){
        A obj = new A(){
            public void show(){
            System.out.println("in new Show");
            }
        };
        obj.show();

    }
}
