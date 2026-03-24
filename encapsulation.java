class human{
    private int age;
    private String name;

    public int getAge(){
        return age;
    }
    public void setAge(int a){
        age = a;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}

public class encapsulation {
    public static void main(String a[]){
        human obj = new human();
        obj.setAge(24);
        obj.setName("jayanth");
        System.out.println(obj.getAge() +" "+ obj.getName());

    }
}
