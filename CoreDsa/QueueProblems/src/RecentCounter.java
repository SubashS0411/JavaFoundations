import java.util.LinkedList;
import java.util.Queue;
//Leetcode problem:933. Number of Recent Calls
//https://leetcode.com/problems/number-of-recent-calls/description/
public class RecentCounter {
    Queue<Integer> queue;
    public RecentCounter(){
        queue=new LinkedList<>();
    }
    public int ping(int t){
        queue.offer(t);
        while(queue.peek()<t-3000){
            queue.poll();
        }
        return queue.size();
    }

    public static void main(String[] args) {
        RecentCounter r=new RecentCounter();

        r.ping(1);
        r.ping(100);
        System.out.println(r.ping(3002));
        System.out.println(r.ping(3001));
        System.out.println(r.ping(4000));

    }
}
