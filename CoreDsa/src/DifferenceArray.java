import java.util.Arrays;

public class DifferenceArray{
//    int[] arr
    public static void main(String[] args) {
        int[][] arr={{1,2,10},{2,3,20},{2,5,25}};
        int n=5;
        System.out.println(Arrays.toString(Diff(arr,n)));

    }
    public static int[] Diff(int [][] arr,int n){
        int[] result=new int[n+2];
        for(int[] book:arr){
            int first=book[0];
            int second=book[1];
            int seats=book[2];
            result[first]+=seats;
            result[second+1]-=seats;
        }
        for (int i = 1; i <=n ; i++) {
            result[i]+=result[i-1];
        }
        return Arrays.copyOfRange(result,1,n+1);

    }
}
