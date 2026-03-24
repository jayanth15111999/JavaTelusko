abstract class Car{
    public abstract void drive();

    public void fly(){
        System.out.println("flying");
    }
}
class Nano extends Car{  //concrete class
    public void swim(){
        System.out.println("swimming");
    }

    @Override
    public void drive() {
        System.out.println("driving");
    }
}
public class Abstract {
    public static void main(String s[]){
        Nano obj = new Nano();
        obj.drive();
        obj.fly();
        obj.swim();
    }
}
