enum Laptop{
    Dell(500), Hp(400), Lenovo(300), Apple(1000);
     private int price;

    private Laptop(int price) {
        this.price = price;
        System.out.println("laptop : "+ this.name());
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }
     
}

public class Enum2 {
    public static void main(String s[]){
        for (Laptop lap : Laptop.values()){
            System.out.println(lap+" : "+lap.getPrice());
        };

    }
}
