import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApiSorted {
   public static void main(String s[]) {
      List<Integer> nums = Arrays.asList(65, 23, 54, 22, 57);
      Stream<Integer> sortedValues = nums.stream()
      .filter(n -> n%2==0)
      .sorted();
      sortedValues.forEach(n->System.out.println(n));
   }
}