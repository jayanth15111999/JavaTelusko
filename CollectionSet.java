import java.util.HashSet;
import java.util.Set;

import java.util.Iterator;

public class CollectionSet {
    public static void main(String s[]){
        Set<Integer> obj = new HashSet<>();

        obj.add(6);
        obj.add(7);
        obj.add(9);
        obj.add(6);

        Iterator<Integer> values = obj.iterator();

        while(values.hasNext())
        System.out.println(values.next());
        

        //for(int n : obj){
        //System.out.println(n);}
    }
}
