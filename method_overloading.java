class calculation{
    public int add(int n1,int n2){
    return n1+n2;
    }
    public int add(int n1,int n2, int n3){
        return n1+n2+n3;
    }
    public double add(double n1, int n2){
        return n1+n2;
    }
}

public class method_overloading {
    public static void main(String a[]){
        calculation obj = new calculation();
        int result= obj.add(2,4 ,6);
        System.out.println(result);
    }
}
