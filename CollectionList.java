
import java.util.ArrayList;
import java.util.List;

public class CollectionList {
    public static void main(String s[]){
        List<Integer> obj = new ArrayList<Integer>();
        obj.add(2);
        obj.add(4);
        obj.add(1);

        System.out.println(obj.get(0));
        System.out.println(obj.indexOf(4));
    }
}
