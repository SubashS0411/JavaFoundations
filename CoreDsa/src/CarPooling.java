public class CarPooling {
//    leetcode Problem 1094:CarPooling
//    https://leetcode.com/problems/car-pooling/description/
    public static void main(String[] args) {
        int[][] trips = {{2,1,5},{3,3,7}};
        int capacity = 5;

        boolean canComplete = carPooling(trips, capacity);
        System.out.println("Can complete all trips? " + canComplete);
        // Output: false
    }
    public static boolean carPooling(int[][] trips,int capacity){
        int[] stops=new int[1001];
        for(int[] trip:trips){
            int numpassenger=trip[0];
            int pickup=trip[1];
            int drop=trip[2];
            stops[pickup]+=numpassenger;
            stops[drop]-=numpassenger;
        }
        int currentPassenger=0;
        for (int i = 0; i < stops.length; i++) {
            currentPassenger+=stops[i];
            if (currentPassenger>capacity) return false;
        }
        return true;
    }
}
