import java.util.Collections;
import java.util.PriorityQueue;
//Leetcode problem:1046. Last Stone Weight
//https://leetcode.com/problems/last-stone-weight/
public class LastStoneWeight {
    public static void main(String[] args) {
        int[] arr={2,7,4,1,8,1};
        System.out.println(lastStoneWeight(arr));
        int[] arr1={1};
        System.out.println(lastStoneWeight(arr1));
    }
    public static  int lastStoneWeight(int[] stones){
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());
        for (int stone:stones){
            maxHeap.offer(stone);
        }
        while (maxHeap.size()>1) {
            int flarge = maxHeap.poll();
            int slarge = maxHeap.poll();
            if (flarge != slarge) {
                maxHeap.offer(flarge - slarge);
            }
        }
        return maxHeap.isEmpty() ? 0 : maxHeap.poll();
    }

}
