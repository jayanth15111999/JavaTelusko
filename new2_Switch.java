public class new2_Switch {
    public static void main(String a[]){
        String name = "monday";
        String result = "";

        result = switch(name){
        case "monday" -> "6am";
        case "tuesday" -> "10am";
        default -> "9am";
    };
    System.out.println(result);
    }
}
