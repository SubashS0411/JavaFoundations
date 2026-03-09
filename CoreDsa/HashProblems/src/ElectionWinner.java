import java.util.HashMap;
import java.util.HashSet;
//Leetcode problem :169 Majority Element
//https://leetcode.com/problems/majority-element/description/
public class ElectionWinner {
    public static void main(String[] args) {
        int[] arr={3, 2, 3};
        System.out.println(majorityElement(arr));
        int[] arr2={2,2,1,1,1,2,2};
        System.out.println(majorityElement(arr2));
    }
    public static int majorityElement(int[] nums){
       HashMap<Integer,Integer> vote=new HashMap<>();
       int n=nums.length;
       for(int candidate:nums){
           int current=vote.getOrDefault(candidate,0)+1;
           vote.put(candidate,current);
           if(current>n/2){
               return candidate;
           }
       }
       return -1;
    }
}
