public class JumpGame {
//    Solved the leetcode problem:55.Jump Game
//    https://leetcode.com/problems/jump-game/description/
    public static void main(String[] args) {
        int[] arr={2, 3, 1, 1, 4};
        System.out.println(CanJump(arr));
    }
    public static boolean CanJump(int[] arr){
        int maxreach=0;
        for (int i = 0; i < arr.length; i++) {
            if(i>maxreach){
                return  false;
            }

            if(maxreach>=arr.length-1){
                return true;
            }
        }
        return true;
    }

}
