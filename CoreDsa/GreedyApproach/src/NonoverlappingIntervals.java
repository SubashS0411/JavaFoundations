import java.util.Arrays;
//Solved the leetcode problem 435:Non-overlapping Intervals
//https://leetcode.com/problems/non-overlapping-intervals/description/
public class NonoverlappingIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1,2},{2,3},{3,4},{1,3}};
        System.out.println(eraseOverlapIntervals(intervals));
    }
    public static int eraseOverlapIntervals(int[][] intervals) {
        if(intervals.length==0) return 0;
        Arrays.sort(intervals, (a, b)->a[1]-b[1]);
        int cancelcount=0;
        int currenttime=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            int start=intervals[i][0];
            if(currenttime>start){
                cancelcount++;
            }
            else {
                currenttime=intervals[i][1];
            }
        }
        return cancelcount;
    }
}
