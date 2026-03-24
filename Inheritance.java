import tools.Calci;
import tools.AdvCalci;
public class Inheritance {
    public static void main(String s[]){
        VeryAdvCalci obj = new VeryAdvCalci();
        int a = obj.add(12, 3);
        int b = obj.sub(15, 5);
        int c = obj.mul(10, 2);
        int d = obj.div(15, 3);
        double e = obj.power(2, 3);
        System.out.println( a + " "+ b +" "+ c +" "+d+" "+e);
    }
}