import java.util.Arrays;
//Leetcode Problem 26.Remove Duplicates from Sorted Array
//https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr={1,1,2,3,3,3};
        int k=RemoveDuplicates(arr);
        System.out.println("Number of Unique elements: "+k);
        int [] unique= Arrays.copyOfRange(arr,0,k);
        System.out.println("Unique Elements"+ Arrays.toString(unique));

    }
    public static int RemoveDuplicates(int[] arr){
        if(arr.length==0){
            return 0;
        }
        int slow=1;
        for (int fast = 1; fast < arr.length ; fast++) {
            if (arr[fast] != arr[fast - 1]) {
                arr[slow] = arr[fast];

                slow++;
            }
        }

        return slow;
    }
}
