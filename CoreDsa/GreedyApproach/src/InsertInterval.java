import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//Solved the leetcode problem 57.Insert Interval
//https://leetcode.com/problems/insert-interval/description/
public class InsertInterval {
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{6,9}};
        int[] newinterval={2,5};
        System.out.println(Arrays.deepToString(insert(intervals,newinterval)));
    }
    public static int[][] insert(int[][] intervals,int[] newinterval){
        List<int[]> result=new ArrayList<>();
        int i=0;
        int n=intervals.length;
        while(i<n && intervals[i][1]<newinterval[0]){
            result.add(intervals[i]);
            i++;
        }
        while(i<n && intervals[i][0]<=newinterval[1]){
            newinterval[0]=Math.min(intervals[i][0],newinterval[0]);
            newinterval[1]=Math.max(intervals[i][1],newinterval[1]);
            i++;

        }
        result.add(newinterval);
        while(i<n){
            result.add(intervals[i]);
            i++;
        }
        return result.toArray(new int [result.size()][]);
    }
}
