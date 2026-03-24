import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class CollectionForEach {
    public static void main(String s[]){
        List<Integer> nums= Arrays.asList(23, 45,67,32,87);
        Collections.sort(nums);

        nums.forEach(n -> System.out.println(n));
        //System.out.println(nums);
        int index = Collections.binarySearch(nums, 87);
        System.out.println(index);

    }
}
