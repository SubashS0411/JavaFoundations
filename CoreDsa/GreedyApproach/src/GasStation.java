public class GasStation {
//    Solved the leetcode problem 134. Gas Station
//    http://leetcode.com/problems/gas-station/description/
    public static void main(String[] args) {
        int[] gas={1,2,3,4,5};
        int[] cost={3,4,5,1,2};
        System.out.println(canCompleteCircuit(gas,cost));
        int[] gas1={2,3,4};
        int[] cost1={3,4,3};
        System.out.println(canCompleteCircuit(gas1,cost1));
    }
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int totalgas=0,totalcost=0;
        int start=0;
        int current=0;
        for(int i=0;i<gas.length;i++){
            totalgas+=gas[i];
            totalcost+=cost[i];
            current+=gas[i]-cost[i];
            if(current<0){
                start++;
                current=0;
            }
        }
        if(totalcost>totalgas){
            return -1;
        }
        return start;
    }
}
