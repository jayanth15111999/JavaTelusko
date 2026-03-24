class human{
    private int age;
    private String name;
    
    public human(){

    }
    public human(int age, String name) {
        this.age = age;
        this.name = name;
    } 
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    
}

public class default_paraConstructor {
    public static void main(String a[]){
        human obj = new human();
        human obj1 = new human(12, "reddy");
        obj.setAge(24);
        obj.setName("jayanth");
        System.out.println(obj.getAge() +" "+ obj.getName());
        System.out.println(obj1.getAge() +" "+ obj1.getName());

    }
}