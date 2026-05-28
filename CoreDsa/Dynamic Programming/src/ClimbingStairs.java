public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(Stairs(24));
    }
    public static int Stairs(int n){
        if(n<2) return n;
        int right = Stairs(n-2);
        int left = Stairs(n-1);
        return left+right;
    }
}
