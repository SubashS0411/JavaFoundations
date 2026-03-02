public class PrefixSum6 {
    static int [] prefixSum;
    PrefixSum6(int[] values){
        prefixSum=new int[values.length];
        prefixSum[0]=values[0];
        for (int i = 1; i < values.length; i++) {
            prefixSum[i]=prefixSum[i-1]+values[i];

        }

    }
    public static int duration(int a,int b){
        if(a==0){
            return prefixSum[b];
        }
        return prefixSum[b]-prefixSum[a-1];
    }
    public static void main(String[] args){
        int [] values={100, 200, 50, 300, 150, 500, 100};
        PrefixSum6 app=new PrefixSum6(values);
        int duration=duration(1,4);
        System.out.println("Duration: "+duration);
    }
}
