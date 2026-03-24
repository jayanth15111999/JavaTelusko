import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;

public class CollectionComparatorString{
    public static void main(String s[]){
        Comparator<String> comp = new Comparator<>(){
            public int compare(String i,String j){
                if (i.length() > j.length())
                    return 1;
                else 
                    return -1;
            }
        };

        List<String> names = new ArrayList<>();

        names.add("jayanth");
        names.add("vinnu");
        names.add("renuka");
        names.add("venkat");
        names.add("reddy");

        Collections.sort(names, comp);

        System.out.println(names);

    }
}