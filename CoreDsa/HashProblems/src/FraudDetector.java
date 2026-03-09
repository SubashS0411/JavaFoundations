import java.util.HashSet;
//leetcode: 217	Contains Duplicate
// https://leetcode.com/problems/contains-duplicate/description/
public class FraudDetector {
    public static void main(String[] args) {
        int [] arr={1,2,3,1};
        System.out.println(containsDuplicate(arr));
        int[] arr1={1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(arr1));
    }
    public static boolean containsDuplicate(int[] nums){
        HashSet<Integer> seen=new HashSet<>();
        for(int num:nums){
            if(seen.contains(num)){
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}
