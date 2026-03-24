import java.util.Arrays;
public class BinarySearch{
    public static int binarySearch(int arr[], int target){
        int low =0;
        int high = arr.length-1;
        while(low<=high){
            int mid = low +(high - low)/2;
            int midvalue = arr[mid];

            if(midvalue<target){
                low = mid+1;
            }
            else if(midvalue>target){
                high = mid-1;
            }
            else return mid;
        }
        return -1;
    }
    public static void main(String [] args){
        int arr[] = {5, 7, 2, 5, 3, 8};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        
        int index = binarySearch(arr, 8);
        if(index ==-1){
            System.out.println("target not found");
        }
        else

        System.out.println("taget found at index "+ index);
    }
}