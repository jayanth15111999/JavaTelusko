import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class LongestConsecutiveSequence {
    public static int longestSequence(int nums[]) {
        Set<Integer> myset = new HashSet<>();
        int maxSize = 0;
        for (int num : nums) {
            myset.add(num);
        }
        for (int num : myset) {
            int currSize = 1;
            int current = num;

            if (!myset.contains(current - 1)) {
                while (myset.contains(current + 1)) {
                    currSize++;
                    current = current + 1;
                }
                maxSize = Math.max(maxSize, currSize);
            }

        }
        return maxSize;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("enter 5 numbers :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("longest sequence is :" + longestSequence(arr));

    }
}
