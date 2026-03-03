public class MountainBikersAltitude {
    //            📌 LeetCode Match: LeetCode 1732: Find the Highest Altitude (Easy)
//    int[] prefixSum;
    public static void main(String[] args) {
        int[] attitude={-5,1,5,0,-7};
        System.out.println(largestAltitude(attitude));
    }
    public static int largestAltitude(int[] gain){
        int [] prefixSum=new int[gain.length];
        prefixSum[0]=gain[0];
        for (int i = 1; i < gain.length; i++) {
            prefixSum[i]=prefixSum[i-1]+gain[i];
        }
        int low=0;
        for (int i = 0; i < gain.length-1; i++) {
            if(low<prefixSum[i+1]){
                low=prefixSum[i+1];
            }
        }
        return low;
    }


}
