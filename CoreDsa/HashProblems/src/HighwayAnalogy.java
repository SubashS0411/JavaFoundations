import java.util.HashMap;
//Leetcode 560 Subarray Sum Equals K
//https://leetcode.com/problems/subarray-sum-equals-k/description/
public class HighwayAnalogy {
    public static void main(String[] args) {
        int[] nums={1,1,1};
        int k=2;
        System.out.println(subarraySum(nums,k));
        int[] n1={3, 4, 7, 2, -3, 1, 4, 2};
        int k1=7;
        System.out.println(subarraySum(n1,k1));
    }
    public static int subarraySum(int[] nums,int k){
        int current=0;
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for (int i = 0; i < nums.length; i++) {
            current+=nums[i];
            int oldmarker=current-k;
            if(map.containsKey(oldmarker)){
                count+=map.get(oldmarker);
            }
            map.put(current,map.getOrDefault(current,0)+1);
        }
        return count;
    }
}
