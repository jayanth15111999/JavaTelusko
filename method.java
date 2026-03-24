class pen{
    public void cost(){
        int i =10;
        System.out.println("cost is" + i);
    }
    public String price(int j){
        if(j>5)
            return "give pen";
        return "nothing";
    }
} 
public class method {
    public static void main(String a[]){
        pen obj = new pen();
        obj.cost();
        String result = obj.price(10);
        System.out.println(result);

    }
}
