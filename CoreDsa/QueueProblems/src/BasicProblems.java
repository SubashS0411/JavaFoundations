import java.util.LinkedList;
import java.util.Queue;

public class BasicProblems {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        queue.offer(10);
        queue.offer(20);
        System.out.println(queue);
        System.out.println(queue.peek());
        queue.offer(20);        queue.poll();
        System.out.println(queue);
        System.out.println(queue.size());
    }
}
