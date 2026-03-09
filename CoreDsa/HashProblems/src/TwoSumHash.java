import java.util.Arrays;
import java.util.HashMap;
//leetcode:
public class TwoSumHash {
    public static void main(String[] args) {
        int[] arr={3, 2, 4};
        int target=6;
        System.out.println(Arrays.toString(twoSum(arr,target)));
        int[] arr2={2,7,11,15};
        int tar2=9;
        System.out.println(Arrays.toString(twoSum(arr2,tar2)));
    }
    public static int[] twoSum(int[] arr,int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement=target-arr[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(arr[i],i);
        }
        return new int[]{-1,-1};

    }
}
