interface Computer{
    void show();
}
class Laptop implements Computer{
    public void show(){
        System.out.println("in laptop");
    }
}
class Desktop implements Computer{
    public void show(){
        System.out.println("in Desktop");
    }
}
class Developer{
    public void dev(Computer d){
        d.show();
    }
}

public class Interface2 {
    public static void main(String s[]){
        Computer a = new Laptop();
        Computer b = new Desktop();

        Developer jay = new Developer();
        jay.dev(a);
    }
}
