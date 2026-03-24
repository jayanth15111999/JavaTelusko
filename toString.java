class Laptop{
    int price;
    String name;

    @Override
    public String toString() {
        return "Laptop [price=" + price + ", name=" + name + "]";
    }
}
public class toString {
    public static void main(String s[]){
        Laptop obj = new Laptop();
        obj.price = 10;
        obj.name = "dell";

        Laptop obj2 = new Laptop();
        obj2.price = 5;
        obj2.name = "hp";

        System.out.println(obj.toString() +" "+ obj2.toString());

    }
}
