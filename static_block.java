    class phone{
        int cost;
        String name;
        static String brand;

        static{
            brand = "realme";
            System.out.println("in static " + brand );
        }
    
        public static void show(phone obj){
            System.out.println(brand +" "+ obj.name+" "+obj.cost);
        }
    }
    public class static_block {
        public static void main(String a[]){
            phone obj = new phone();
            obj.name = "iphone";
            obj.cost = 1500;
            //phone.brand = "apple";

            phone.show(obj);
    
    
        }
    }
