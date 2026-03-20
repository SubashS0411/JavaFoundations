import java.util.PriorityQueue;
//Leetcode problem:215:Kth Largest Element in an Array
//https://leetcode.com/problems/kth-largest-element-in-an-array/description/
public class KthLargestElementinanArray {
    public static void main(String[] args) {
        int[] nums={3,2,1,5,6,4};
        int k=2;
        System.out.println(findKthLargest(nums,k));
        int[] num1={3,2,3,1,2,4,5,5,6};
        int k1=4;
        System.out.println(findKthLargest(num1,k1));
    }
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minheap=new PriorityQueue<>();
        for(int num:nums){
            minheap.offer(num);
            if(minheap.size()>k){
                minheap.poll();
            }
        }
        return minheap.peek();
    }
}
