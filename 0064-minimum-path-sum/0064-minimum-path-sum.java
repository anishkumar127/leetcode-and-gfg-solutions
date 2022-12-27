class Solution {
    public int minPathSum(int[][] grid) {
        if(grid==null || grid.length==0){
            return 0;
        }
        HashMap<String, Integer> map = new HashMap<>();
        
        int ans = maxSumRecursion(0,0,grid,map);
        
        return ans;
    }
        private int maxSumRecursion(int i , int j , int [][] grid, HashMap<String,Integer>map){
        int n = grid.length-1;
        int m = grid[0].length-1;
        
        if(i>n || j>m){
            return Integer.MAX_VALUE;
        }
        if(i==n && j==m){
            return grid[i][j];
        }
        
        String key = i+"#"+j;
        if(map.containsKey(key)){
            return map.get(key);
        }
            
        int x = maxSumRecursion(i+1,j,grid,map);
        int y = maxSumRecursion(i,j+1,grid,map);
        map.put(key,Math.min(x,y)+grid[i][j]);
        return Math.min(x,y)+grid[i][j];
        
    }
}