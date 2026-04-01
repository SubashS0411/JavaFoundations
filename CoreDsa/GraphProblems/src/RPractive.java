import java.util.LinkedList;
import java.util.Queue;
//Leetcode Problem 994 Rotting Oranges
//Approach
//1. Create your Clock and D-Pad:
//Create int minutes = 0;
//Create your D-Pad: int[][] directions = {{1,0}, {-1,0}, {0,1}, {0,-1}};
//2. Start the Timer (The while loop):
//Keep the loop running as long as: The queue is NOT empty AND freshcount > 0. (If freshcount hits 0, the game is over, stop the clock!)
//3. Process exactly ONE minute of time:
//Take a snapshot of how many zombies are acting this minute: int size = queue.size();
//Run a for loop size times.
//Inside the loop:
//Pull a zombie out: int[] zombie = queue.poll();
//Get its coordinates: int r = zombie[0]; int c = zombie[1];
//Look in all 4 directions using the D-Pad.
//4. The Bite (Inside the D-Pad loop):
//Calculate the neighbor's coordinates: int newR = r + dir[0]; int newC = c + dir[1];
//The Safety Check: Is this neighbor actually inside the grid? (newR >= 0 && newR < grid.length && newC >= 0 && newC < grid[0].length)
//The Target Check: Is the neighbor a fresh orange? (grid[newR][newC] == 1)
//If YES to both:
//Bite it! grid[newR][newC] = 2;
//Reduce the human population: freshcount--;
//Throw the brand new zombie into the queue: queue.offer(new int[]{newR, newC});
//5. Tick the Clock:
//After the for loop finishes (meaning all zombies for this minute have bitten their neighbors), increase the time: minutes++;
//6. The Final Check:
//Outside the whole while loop, did we save anyone?
//If freshcount == 0, return minutes.
//If freshcount > 0 (someone survived trapped in a corner), return -1.
public class RPractive {
    public static void main(String[] args) {
        Queue<int[]> queue=new LinkedList<>();
//        queue.offer(new int[]{2,4});
//        queue.offer(new int[]{4,5});
//        int[] zombie=queue.poll();
//        System.out.println(zombie[0]);
//        System.out.println(zombie[1]);
//        int[] zombie1=queue.poll();
//        System.out.println(zombie1[0]);
//        System.out.println(zombie1[1]);
        int freshcount=0;
//        for (int r = 0; r < grid.length; r++) {
//            for (int c = 0; c < grid[0].length; c++) {
//              if(grid[r][c]==1)  {
//                  freshcount++;
//              }
//              else if(grid[r][c]==2 ){
//                  queue.offer(new int[]{r,c});
//              }
//            }
//
//        }
        // {row_change, col_change}
        int[][] directions = {
                {-1, 0},  // UP: Row decreases, Col stays same
                {1, 0},   // DOWN: Row increases, Col stays same
                {0, -1},  // LEFT: Row stays same, Col decreases
                {0, 1}    // RIGHT: Row stays same, Col increases
        };
        int[][]grid={{2,1,1},{1,1,0},{0,1,1}};
        System.out.println(orangesRotting(grid));

    }
    public static int orangesRotting(int[][] grid) {
        Queue<int[]> queue=new LinkedList<>();
        int freshcount=0;
        int minutes=0;
        int[][] directions = {
                {-1, 0},  // UP: Row decreases, Col stays same
                {1, 0},   // DOWN: Row increases, Col stays same
                {0, -1},  // LEFT: Row stays same, Col decreases
                {0, 1}    // RIGHT: Row stays same, Col increases
        };
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
              if(grid[r][c]==1)  {
                  freshcount++;
              }
              else if(grid[r][c]==2 ){
                  queue.offer(new int[]{r,c});
              }
            }

        }
        while(!queue.isEmpty()&& freshcount>0) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] zombie = queue.poll();
                int r = zombie[0];
                int c = zombie[1];


                for (int[] dir : directions) {
                    int newR = r + dir[0];
                    int newC=c+dir[1];
                    if(newR<0 || newR>=grid.length || newC<0|| newC>=grid[0].length||grid[newR][newC]!=1){
                        continue;
                    }
                    grid[newR][newC]=2;
                    freshcount--;
                    queue.offer(new int[]{newR,newC});
                }
            }
            minutes++;
        }
//
        return freshcount==0 ? minutes:-1;
    }
}
