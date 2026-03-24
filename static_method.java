class phone {
    int cost;
    String name;
    static String brand;

    public static void show(phone obj) {
        System.out.println(brand + " " + obj.name + " " + obj.cost);
    }
}

public class static_method {
    public static void main(String a[]) {
        phone obj = new phone();
        obj.name = "iphone";
        obj.cost = 1500;
        phone.brand = "apple";

        phone obj2 = new phone();
        obj2.name = "galaxy";
        obj2.cost = 1000;
        phone.brand = "samsung";

        // obj.show();
        // obj2.show();

        phone.show(obj2);

    }
}
