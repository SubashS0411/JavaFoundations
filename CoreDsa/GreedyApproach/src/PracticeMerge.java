import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//leetcode problem 56 Merge Intervals
//https://leetcode.com/problems/merge-intervals/description/
public class PracticeMerge {
    public static void main(String[] args) {
        int[][] arr={{8, 10}, {1,3}, {15, 18}, {2, 6}};
        System.out.println(Arrays.deepToString(merge(arr)));
    }
    public static int[][] merge(int[][] intervals){
        if(intervals.length==0){
            return new int[0][];
        }

        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<int[]>savedbox=new ArrayList<>();
        savedbox.add(intervals[0]);
        for (int i = 1; i < intervals.length ; i++) {
            int[] curremtlevel=intervals[i];
            int[] lastlevel=savedbox.get(savedbox.size()-1);
            if(curremtlevel[0]<lastlevel[1]){
                lastlevel[1]=Math.max(curremtlevel[1],lastlevel[1]);
            }
            else {
                savedbox.add(curremtlevel);
            }
        }
        return savedbox.toArray(new int[savedbox.size()][]);
    }
}
