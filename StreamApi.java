import java.util.Arrays;
import java.util.List;

public class StreamApi {
    public static void main(String s[]){
        List<Integer> nums = Arrays.asList(34,54,9,24,65,92);

        int result = nums.stream()
        .filter(n -> n%2==0)
        .map(n -> n*2)
        .reduce(0, (c,e)->c+e);
        //nums.forEach(n -> System.out.println(n));
        System.out.println(result);
    }
}
