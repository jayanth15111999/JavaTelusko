import java.util.Arrays;
class twoPointer{
    static boolean twoSum(int arr[], int k){

        Arrays.sort(arr);
        int left = 0, right = arr.length - 1;
        while(left<right){
            int two_sum = arr[left] + arr[right];
            if(two_sum == k){
                return true;
            }
            if(two_sum < k){
                left++;
            }
            else{
            right--;}
            
        }
        return false;
        
    }
    public static void main(String []a){
        int arr[] = {1,4,5,3,10,11};
        int k = 7;
        if(twoSum(arr, k)){
            System.out.println("true");

        }
        else{
        System.out.println("false");}
    }
}