class calculation{
    int num1 =5;
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

public class stack_heap {
    public static void main(String a[]){
        calculation obj = new calculation();
        calculation obj2 = new calculation();
        int result= obj.add(2,4 ,6);
        obj2.num1 = 8;
        System.out.println(obj.num1);
        System.out.println(obj2.num1);
    }
}
