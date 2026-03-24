class phone{
    int cost;
    String name;
    static String brand;

    public void show(){
        System.out.println(brand +" "+ name+" "+cost);
    }
}
public class static_variable {
    public static void main(String a[]){
        phone obj = new phone();
        obj.name = "iphone";
        obj.cost = 1500;
        phone.brand = "apple";

        phone obj2 = new phone();
        obj2.name = "galaxy";
        obj2.cost = 1000;
        phone.brand = "samsung";

        obj.show();
        obj2.show();


    }
}
