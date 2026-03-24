import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class BasicOfMinHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> minheap=new PriorityQueue<>();
        minheap.offer(10);
        minheap.offer(20);
        minheap.offer(40);
        minheap.offer(5);
        System.out.println(minheap.poll());
        PriorityQueue<Integer> maxheap=new PriorityQueue<>(Collections.reverseOrder());
        maxheap.offer(10);
        maxheap.offer(20);
        maxheap.offer(50);
        maxheap.offer(90);
        System.out.println(maxheap.poll());
    }
}
