class Solution {
    public int countNegatives(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int cnt = 0;
        int col = 0;
        int row = n-1;
        
        while( row>=0 && col<m){
            if(grid[row][col]<0){
                row--;
                cnt += m-col;
            }else{
                col++;
            }
        }
        return cnt;
    }
}