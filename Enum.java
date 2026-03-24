enum Status{
    Running, Pause, Failed, Success;
}
public class Enum {
    public static void main(String s[]){
        Status stat[] = Status.values();
        for (Status ss : stat){
        System.out.println(ss);}
    }
}
