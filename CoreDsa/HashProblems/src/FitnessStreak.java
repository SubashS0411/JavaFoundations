import java.util.HashSet;
//leetcode problem: 128 Longest Consecutive Sequence
//https://leetcode.com/problems/longest-consecutive-sequence/description/
public class FitnessStreak {
    public static void main(String[] args) {
        int[] arr={100,4,200,1,3,2};
        System.out.println(longestConsecutive(arr));
        int[] arr2={0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive(arr2));
    }
    public static int longestConsecutive(int[] nums){
        if(nums==null||nums.length==0){
            return 0;
        }
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int longstreak=0;
        for (int num:set){
            if(!set.contains(num-1)){
                int current=num;
                int currentstreak=1;
                while(set.contains(current+1)){
                    current+=1;
                    currentstreak+=1;
                }
                longstreak=Math.max(longstreak,currentstreak);
            }

        }
        return longstreak;
    }
}
