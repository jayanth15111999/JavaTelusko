import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
public class CollectionMap {
    public static void main(String s[]){
        Map<String, Integer> Students = new Hashtable<>();
        Students.put("Jayanth", 10);
        Students.put("vinnu",1);
        Students.put("reddy",5);

        Students.remove("reddy");

        System.out.println(Students.keySet());
        System.out.println(Students.values());

        for(String a : Students.keySet()){
            System.out.println("Name :"+a+" Rank :"+Students.get(a));
        }
    }
}
