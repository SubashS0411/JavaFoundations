import javax.swing.tree.TreeNode;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
//Leetcode Problem:347 Top K Frequent Elements
//https://leetcode.com/problems/top-k-frequent-elements/description/
public class TopKFrequentElements {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 3};
        int k = 2;
        System.out.println(Arrays.toString(topKFrequent(arr, k)));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hashmap = new HashMap<>();
        for (int num : nums) {
            hashmap.put(num, hashmap.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> minheap = new PriorityQueue<>(
                (a, b) -> hashmap.get(a) - hashmap.get(b));

        for (int num : hashmap.keySet()) {
            minheap.offer(num);
            if (minheap.size() > k) {
                minheap.poll();
            }

        }
        int[] result = new int[k];
//        least frequent to most frequent
//        for (int i = 0; i < k; i++) {
//            result[i]=minheap.poll();
//        }
//        most frequent to least frequent
        for (int i = k - 1; i >= 0; i--) {
            result[i] = minheap.poll();
        }
        return result;
    }
//    Leetcode Problem:230 Kth Smallest Element in a BST
//    https://leetcode.com/problems/kth-smallest-element-in-a-bst/description/
//    int count=0;
//    int ans=0;
//    public static int kthSmallest(TreeNode root, int k) {
//        inorderTraversal(root,k);
//        return ans;
//    }
//    public static void inorderTraversal(TreeNode root,int k){
//        if(root==null){
//            return;
//        }
//        inorderTraversal(root.left,k);
//        count++;
//        if(count==k){
//            ans=root.val;
//            return;
//        }
//        inorderTraversal(root.right,k);

}

