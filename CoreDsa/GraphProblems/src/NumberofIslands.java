public class NumberofIslands {
//    Leetcode Problem:200 Number of Islands
//    https://leetcode.com/problems/number-of-islands/description/
    public static void main(String[] args) {
        char[][] grid={{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};
        System.out.println(numIslands(grid));
        char[][] grid1={{'1','1','0','0','0'},{'1','1','0','0','0'},{'0','0','1','0','0'},{'0','0','0','1','1'}};
        System.out.println(numIslands(grid1));
    }
    public static int numIslands(char[][] grid){
        int islandcount=0;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if(grid[r][c]=='1'){
                    islandcount++;
                    sinkisland(grid,r,c);
                }
            }

        }
        return islandcount;
    }
    public static void sinkisland(char[][] grid,int r,int c){
        if(r<0||c<0||r>= grid.length||c>= grid[0].length||grid[r][c]=='0'){
            return;
        }
        grid[r][c]='0';
        sinkisland(grid, r+1, c);
        sinkisland(grid,r-1,c);
        sinkisland(grid,r,c+1);
        sinkisland(grid,r,c-1);
    }
}
