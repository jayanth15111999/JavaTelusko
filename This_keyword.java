class human{
    private int age;
    private String name;
    
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

public class this_keyword {
    public static void main(String a[]){
        human obj = new human();
        obj.setAge(24);
        obj.setName("jayanth");
        System.out.println(obj.getAge() +" "+ obj.getName());

    }
}

