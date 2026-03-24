import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;

public class CollectionComparator {
    public static void main(String s[]){
        Comparator<Integer> comp = new Comparator<Integer>() 
        {
            public int compare(Integer i,Integer j)
            {
                if(i%10 > j%10)
                    return 1;
                else
                    return -1;
            }
        };
        List<Integer> numbers = new ArrayList<>();

        numbers.add(43);
        numbers.add(96);
        numbers.add(34);
        numbers.add(23);

        
        Collections.sort(numbers, comp);
        System.out.println(numbers);

        int index = Collections.binarySearch(numbers, 34, comp);
        System.out.println(index);

    }
}
