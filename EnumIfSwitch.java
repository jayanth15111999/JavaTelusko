enum Status{
    Running, Pending, Stopped, Passed;
}
public class EnumIfSwitch{
    public static void main(String s[]){
        Status stat = Status.Pending;
        switch(stat){
        case Running:
        System.out.println("Running");
        break;
        case Pending:
        System.out.println("Pending");
        break;
        case Stopped:
        System.out.println("Stopped");
        break;
        case Passed:
        System.out.println("Passed");
        break;
        }
    }
}